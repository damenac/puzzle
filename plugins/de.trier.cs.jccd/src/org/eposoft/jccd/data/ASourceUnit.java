package org.eposoft.jccd.data;

import java.util.HashMap;


/**
 * @author biegel
 */
public abstract class ASourceUnit {

	/** text buffer: very important to use same object references to same string */
	// private static HashMap<String, String> textBuffer = new HashMap<String,
	// String>();
	//
	// /** key buffer */
	// private static HashMap<String, String> keyBuffer = new HashMap<String,
	// String>();
	//
	// /** value buffer */
	// private static HashMap<String, String> valueBuffer = new HashMap<String,
	// String>();

	/** counter for the unique number of every new created node */
	private static int nodesId = 0;

	/** annotations for this node */
	protected HashMap<Class<?>, HashMap<Object, Object>> annotations = null;

	/** unique id number of this node */
	private int id;

	/** line number */
	protected SourceUnitPosition position = null;

	/** node-text */
	private String text = null;

	/**
	 * Standard constructor.
	 */
	public ASourceUnit() {
		this.id = nodesId++;
	}

	/**
	 * Adds an annotation to a node.
	 * 
	 * @param group
	 *            name of the annotation group
	 * @param key
	 *            annotation name
	 * @param value
	 *            annotation value
	 */
	public void addAnnotation(final Class<?> group, final Object key,
			final Object value) {
		if (null == this.annotations) {
			this.annotations = new HashMap<Class<?>, HashMap<Object, Object>>();
		}

		HashMap<Object, Object> groupMap = this.annotations.get(group);
		if (null == groupMap) {
			groupMap = new HashMap<Object, Object>();
			this.annotations.put(group, groupMap);
		}

		groupMap.put(key, value);
	}

	/**
	 * Returns a value of an annotation key in a specific group.
	 * 
	 * @param group
	 *            name of the annotation group
	 * @param key
	 *            annotation name
	 * @return annotation value
	 */
	public Object getAnnotation(final Class<?> group, final Object key) {
		if (null == this.annotations) {
			return null;
		}

		final HashMap<Object, Object> groupMap = this.annotations.get(group);
		if (null == groupMap) {
			return null;
		}

		return groupMap.get(key);
	}

	/**
	 * @return the annotations
	 */
	public HashMap<Class<?>, HashMap<Object, Object>> getAnnotations() {
		return annotations;
	}

	/**
	 * name of the annotation group
	 * 
	 * @return all keys and values of an annotation group.
	 */
	public HashMap<Object, Object> getAnnotationsForGroup(final Class<?> group) {
		if (null == this.annotations) {
			return null;
		}

		return this.annotations.get(group);
	}

	/**
	 * @return the charPositionInLine
	 */
	public int getCharPositionInLine() {
		if (null == this.position) {
			return -1;
		}
		return this.position.getCharacter();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the line
	 */
	public int getLine() {
		if (null == this.position) {
			return -1;
		}
		return this.position.getLine();
	}

	/**
	 * @return the position
	 */
	SourceUnitPosition getPosition() {
		return position;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * @param charPositionInLine
	 *            the charPositionInLine to set
	 */
	public void setCharPositionInLine(int charPositionInLine) {
		if (null == this.position) {
			this.position = new SourceUnitPosition();
		}
		this.position.setCharacter(charPositionInLine);
	}

	/**
	 * @param line
	 *            the line to set
	 */
	public void setLine(int line) {
		if (null == this.position) {
			this.position = new SourceUnitPosition();
		}
		this.position.setLine(line);
	}

	/**
	 * @param position
	 *            the position to set
	 */
	void setPosition(SourceUnitPosition position) {
		this.position = position;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(final String text) {
		this.text = text;
	}

	/**
	 * 
	 * @return
	 */
	// public abstract JCCDFile getFile();
}
