package org.eposoft.jccd.data;

/**
 * All position information of a single source unit.
 * 
 * @author biegel
 */
public final class SourceUnitPosition {

	/** line position */
	private int line = -1;

	/** character position in line */
	private int character = -1;

	/**
	 * Standard constructor.
	 */
	public SourceUnitPosition() {

	}

	/**
	 * Constructor with position.
	 * 
	 * @param line
	 *            line position
	 * @param character
	 *            character position in line
	 */
	public SourceUnitPosition(final int line, final int character) {
		this.line = line;
		this.character = character;
	}

	/**
	 * @return the line
	 */
	public int getLine() {
		return line;
	}

	/**
	 * @param line
	 *            the line to set
	 */
	public void setLine(int line) {
		this.line = line;
	}

	/**
	 * @return the character
	 */
	public int getCharacter() {
		return character;
	}

	/**
	 * @param character
	 *            the character to set
	 */
	public void setCharacter(int character) {
		this.character = character;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + character;
		result = prime * result + line;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SourceUnitPosition other = (SourceUnitPosition) obj;
		if (character != other.character)
			return false;
		if (line != other.line)
			return false;
		return true;
	}
}
