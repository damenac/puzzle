package org.eposoft.jccd.data.ast;

/**
 * Special AST node which additionally holds the original token string out of
 * the source code.
 * 
 * @author biegel
 */
public final class NodeAst extends ANode {

	private String token = null;

	/**
	 * @return the token
	 */
	public String getToken() {
		if (null == this.token) {
			return this.getText();
		}
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	void setToken(String token) {
		this.token = token;
	}

	/**
	 * Constructor. Only classes in this package could create an instance of
	 * this class.
	 */
	NodeAst() {
	}

}
