package org.eposoft.jccd.data.ast;

/**
 * Additional types for AST nodes.
 * 
 * @author biegel
 */
public enum NodeTypes {

	PROJECT(10000), FILE(10001), IDENT(10002);

	/** node type text */
	private final String text;

	/** node type number */
	private final int type;

	/**
	 * Standard constructor.
	 * 
	 * @param type
	 *            node type number
	 * @param text
	 *            node type text
	 */
	private NodeTypes(int type, String text) {
		this.text = text;
		this.type = type;
	}

	/**
	 * Special constructor for nodes with individual text.
	 * 
	 * @param type
	 *            node type number
	 */
	private NodeTypes(int type) {
		this(type, null);
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return this.type;
	}

}
