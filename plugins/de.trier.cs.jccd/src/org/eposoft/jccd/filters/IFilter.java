package org.eposoft.jccd.filters;

import org.eposoft.jccd.data.SimilarityGroupManager;

/**
 * Abstract class to filter similarity groups.
 * 
 * @author biegel
 */
public interface IFilter {

	/**
	 * Filters similarity groups.
	 * 
	 * @param simGroup
	 *            array of similarity groups
	 * @return filtered similarity groups
	 */
	public abstract void start(final SimilarityGroupManager simContainer);

}
