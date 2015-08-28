package org.eposoft.jccd.preprocessors.java;

import java.util.HashSet;

import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Removes all identifier of variables.
 * 
 * @author biegel
 */
public class GeneralizeVariableNames extends ARemoveIdentifierNodes {

	@Override
	protected HashSet<Integer> getParentNodeTypesToRemove() {
		final HashSet<Integer> types = new HashSet<Integer>();
		// operators and other special chars
		types.add(Antlr3JavaParser.ASSIGN);
		types.add(Antlr3JavaParser.AND);
		types.add(Antlr3JavaParser.AND_ASSIGN);
		types.add(Antlr3JavaParser.BIT_SHIFT_RIGHT);
		types.add(Antlr3JavaParser.BIT_SHIFT_RIGHT_ASSIGN);
		types.add(Antlr3JavaParser.POST_DEC);
		types.add(Antlr3JavaParser.PRE_DEC);
		types.add(Antlr3JavaParser.DIV);
		types.add(Antlr3JavaParser.DIV_ASSIGN);
		types.add(Antlr3JavaParser.EQUAL);
		types.add(Antlr3JavaParser.GREATER_OR_EQUAL);
		types.add(Antlr3JavaParser.GREATER_THAN);
		types.add(Antlr3JavaParser.POST_INC);
		types.add(Antlr3JavaParser.PRE_INC);
		types.add(Antlr3JavaParser.LESS_OR_EQUAL);
		types.add(Antlr3JavaParser.LESS_THAN);
		types.add(Antlr3JavaParser.LOGICAL_AND);
		types.add(Antlr3JavaParser.LOGICAL_NOT);
		types.add(Antlr3JavaParser.LOGICAL_OR);
		types.add(Antlr3JavaParser.MINUS);
		types.add(Antlr3JavaParser.MINUS_ASSIGN);
		types.add(Antlr3JavaParser.MOD);
		types.add(Antlr3JavaParser.MOD_ASSIGN);
		types.add(Antlr3JavaParser.NOT);
		types.add(Antlr3JavaParser.NOT_EQUAL);
		types.add(Antlr3JavaParser.OR);
		types.add(Antlr3JavaParser.OR_ASSIGN);
		types.add(Antlr3JavaParser.PLUS);
		types.add(Antlr3JavaParser.PLUS_ASSIGN);
		types.add(Antlr3JavaParser.SHIFT_LEFT);
		types.add(Antlr3JavaParser.SHIFT_LEFT_ASSIGN);
		types.add(Antlr3JavaParser.SHIFT_RIGHT);
		types.add(Antlr3JavaParser.SHIFT_RIGHT_ASSIGN);
		types.add(Antlr3JavaParser.STAR);
		types.add(Antlr3JavaParser.STAR_ASSIGN);
		types.add(Antlr3JavaParser.XOR);
		types.add(Antlr3JavaParser.XOR_ASSIGN);

		// keywords
		types.add(Antlr3JavaParser.INSTANCEOF);
		types.add(Antlr3JavaParser.THIS);
		types.add(Antlr3JavaParser.IF);
		types.add(Antlr3JavaParser.WHILE);

		// tokens for imaginary nodes
		types.add(Antlr3JavaParser.ARRAY_ELEMENT_ACCESS);
		types.add(Antlr3JavaParser.CAST_EXPR);
		types.add(Antlr3JavaParser.ENUM_TOP_LEVEL_SCOPE);
		types.add(Antlr3JavaParser.EXPR);
		types.add(Antlr3JavaParser.FOR_EACH);
		types.add(Antlr3JavaParser.FORMAL_PARAM_STD_DECL);
		types.add(Antlr3JavaParser.FORMAL_PARAM_VARARG_DECL);
		types.add(Antlr3JavaParser.UNARY_MINUS);
		types.add(Antlr3JavaParser.UNARY_PLUS);
		types.add(Antlr3JavaParser.VAR_DECLARATOR);

		// custom tokens
		types.add(NodeTypes.IDENT.getType());
		return types;
	}

}
