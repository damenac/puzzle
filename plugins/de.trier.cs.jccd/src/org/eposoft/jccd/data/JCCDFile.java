package org.eposoft.jccd.data;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * Special file class which considers file name prefixes.
 * 
 * @author biegel
 */
public final class JCCDFile {

	/** name of the file */
	private final File file;

	/** prefix of the file */
	private final String prefix;

	/**
	 * Constructor without prefix information.
	 * 
	 * @param file
	 *            file name
	 */
	public JCCDFile(final String file) {
		this(new File(file), null);
	}

	/**
	 * Constructor without prefix information.
	 * 
	 * @param file
	 *            file object
	 */
	public JCCDFile(final File file) {
		this(file, null);
	}

	/**
	 * Standard constructor.
	 * 
	 * @param file
	 *            file name
	 * @param prefix
	 *            prefix of the file
	 */
	public JCCDFile(final String file, final String prefix) {
		this(new File(file), prefix);
	}

	/**
	 * Standard constructor.
	 * 
	 * @param file
	 *            file object
	 * @param prefix
	 *            prefix of the file
	 */
	public JCCDFile(final File file, final String prefix) {
		this.file = file;
		if ((null != prefix) && (this.file.getPath().startsWith(prefix))) {
			this.prefix = prefix;
		} else {
			this.prefix = null;
		}
	}

	/**
	 * @return the qualifiedName
	 * @throws IOException
	 */
	public String getCanonicalPath() throws IOException {
		return this.file.getCanonicalPath();
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @return name of the file
	 */
	public String getName() {
		return this.file.getName();
	}

	/**
	 * @return name of the file without prefix
	 */
	public String getNameWithoutPrefix() {
		if (null != this.prefix) {
			return this.file.getPath().substring(this.prefix.length());
		}
		return this.file.getPath();
	}

	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return this.prefix;
	}

	/**
	 * Checks if file is a directory
	 * 
	 * @return is directory?
	 */
	public boolean isDirectory() {
		return this.file.isDirectory();
	}

	/**
	 * All files in a directory (filtered)
	 * 
	 * @param fileFilter
	 *            specific file filter
	 * @return list of all files in this directory
	 */
	public JCCDFile[] listFiles(final FileFilter fileFilter) {
		final File[] files = this.file.listFiles(fileFilter);
		final JCCDFile[] jccdFiles = new JCCDFile[files.length];
		for (int i = files.length; --i >= 0;) {
			jccdFiles[i] = new JCCDFile(files[i], this.prefix);
		}

		return jccdFiles;
	}
}
