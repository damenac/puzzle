package org.eposoft.jccd.preprocessors.java;

import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;
import org.eposoft.jccd.preprocessors.APreprocessor;

/**
 * Abstract class for all variable renaming preprocessors.
 * 
 * @author biegel
 */
public abstract class ARenameVariableNames extends APreprocessor {

	/**
	 * Representation of a variable identifier.
	 * 
	 * @author biegel
	 */
	protected class VariableIdentifier {

		/** variable identifier node */
		private final ANode node;

		/** variable called with keyword `this` */
		private boolean hasThis = false;

		/**
		 * Standard constructor.
		 * 
		 * @param node
		 *            variable identifier node
		 */
		public VariableIdentifier(final ANode node) {
			this.node = node;
		}

		/**
		 * Builds the identifier recursive out of the tree.
		 * 
		 * @param node
		 *            any identiefer node
		 * @param sb
		 *            string buffer in which the name will be written in the
		 *            right order
		 */
		private void buildIdentifierRecursive(final ANode node,
				final StringBuffer sb) {
			if ((Antlr3JavaParser.IDENT == node.getType())
					|| (Antlr3JavaParser.THIS == node.getType())) {
				if (0 != sb.length()) {
					sb.append('.');
				} else {
					// add `this` manually to all global variables
					if (this.hasThis
							&& !(Antlr3JavaParser.THIS == node.getType())) {
						sb.append("this.");
					}
				}
				sb.append(node.getText());
				return;
			}

			for (int i = 0; i < node.getChildCount(); i++) {
				buildIdentifierRecursive(node.getChild(i), sb);
			}
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			VariableIdentifier other = (VariableIdentifier) obj;
			return (this.hashCode() == other.hashCode());
		}

		@Override
		public int hashCode() {
			final StringBuffer sb = new StringBuffer();
			buildIdentifierRecursive(this.node, sb);
			return sb.toString().hashCode();
		}

		/**
		 * @param hasThis
		 *            the hasThis to set
		 */
		public void setHasThis(boolean hasThis) {
			this.hasThis = hasThis;
		}

		@Override
		public String toString() {
			final StringBuffer sb = new StringBuffer();
			buildIdentifierRecursive(this.node, sb);
			return sb.toString();
		}
	}

	/**
	 * Checks if node is a variable identifier.
	 * 
	 * @param node
	 *            any node of the AST
	 * @return variable identifier true/false?
	 */
	public final static boolean isVariableIdentifier(ANode node) {
		if (null == node.getParent()) {
			return false;
		}

		if ((Antlr3JavaParser.DOT != node.getType())
				&& (Antlr3JavaParser.IDENT) != node.getType()
				&& (NodeTypes.IDENT.getType() != node.getType())) {
			return false;
		}

		switch (node.getParent().getType()) {
		// variable initialization
		case Antlr3JavaParser.VAR_DECLARATOR:
		case Antlr3JavaParser.FORMAL_PARAM_STD_DECL:
		case Antlr3JavaParser.FORMAL_PARAM_VARARG_DECL:
		case Antlr3JavaParser.ENUM_TOP_LEVEL_SCOPE:

			// operators and other special chars
		case Antlr3JavaParser.ASSIGN:
		case Antlr3JavaParser.AND:
		case Antlr3JavaParser.AND_ASSIGN:
		case Antlr3JavaParser.BIT_SHIFT_RIGHT:
		case Antlr3JavaParser.BIT_SHIFT_RIGHT_ASSIGN:
		case Antlr3JavaParser.POST_DEC:
		case Antlr3JavaParser.PRE_DEC:
		case Antlr3JavaParser.DIV:
		case Antlr3JavaParser.DIV_ASSIGN:
		case Antlr3JavaParser.EQUAL:
		case Antlr3JavaParser.GREATER_OR_EQUAL:
		case Antlr3JavaParser.GREATER_THAN:
		case Antlr3JavaParser.POST_INC:
		case Antlr3JavaParser.PRE_INC:
		case Antlr3JavaParser.LESS_OR_EQUAL:
		case Antlr3JavaParser.LESS_THAN:
		case Antlr3JavaParser.LOGICAL_AND:
		case Antlr3JavaParser.LOGICAL_NOT:
		case Antlr3JavaParser.LOGICAL_OR:
		case Antlr3JavaParser.MINUS:
		case Antlr3JavaParser.MINUS_ASSIGN:
		case Antlr3JavaParser.MOD:
		case Antlr3JavaParser.MOD_ASSIGN:
		case Antlr3JavaParser.NOT:
		case Antlr3JavaParser.NOT_EQUAL:
		case Antlr3JavaParser.OR:
		case Antlr3JavaParser.OR_ASSIGN:
		case Antlr3JavaParser.PLUS:
		case Antlr3JavaParser.PLUS_ASSIGN:
		case Antlr3JavaParser.SHIFT_LEFT:
		case Antlr3JavaParser.SHIFT_LEFT_ASSIGN:
		case Antlr3JavaParser.SHIFT_RIGHT:
		case Antlr3JavaParser.SHIFT_RIGHT_ASSIGN:
		case Antlr3JavaParser.STAR:
		case Antlr3JavaParser.STAR_ASSIGN:
		case Antlr3JavaParser.XOR:
		case Antlr3JavaParser.XOR_ASSIGN:

			// keywords
		case Antlr3JavaParser.INSTANCEOF:
		case Antlr3JavaParser.THIS:

			// tokens for imaginary nodes
		case Antlr3JavaParser.ARRAY_ELEMENT_ACCESS:
		case Antlr3JavaParser.CAST_EXPR:
		case Antlr3JavaParser.EXPR:
		case Antlr3JavaParser.FOR_EACH:
		case Antlr3JavaParser.UNARY_MINUS:
		case Antlr3JavaParser.UNARY_PLUS:
			return true;
		case Antlr3JavaParser.DOT:
			// variable identifier must be the first child under a dot-node
			// except if there is a `this` before the identifier
			final int childNumber;
			if (node.getParent().getChild(0).getType() == Antlr3JavaParser.THIS) {
				childNumber = 1;
			} else {
				childNumber = 0;
			}

			if (node.getParent().getChild(childNumber).getId() != node
					.getId()) {
				return false;
			}
			break;
		default:
			return false;
		}

		// check if identifier-node hangs under a method_call-node
		while ((node.getParent() != null)
				&& (node.getParent().getType() == Antlr3JavaParser.DOT)) {
			node = node.getParent();
		}

		if ((node.getParent() != null)
				&& ((node.getParent().getType() == Antlr3JavaParser.METHOD_CALL) || isVariableIdentifier(node))) {
			return true;
		}

		return false;
	}

	/**
	 * Standard constructor which will set the general annotation group.
	 */
	public ARenameVariableNames() {
		// set general annotation group
		this.setAnnotationGroup(ARenameVariableNames.class);
	}
}
