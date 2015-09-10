package fr.inria.diverse.puzzle.metrics.managers;

import java.io.File;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;

/**
 * Abstract metrics manager
 * @author David Mendez-Acuna
 *
 */
public abstract class MetricsManager {

	// ------------------------------------------------------
	// Attributes
	// ------------------------------------------------------
	
	protected IProject project;
	
	// ------------------------------------------------------
	// Methods
	// ------------------------------------------------------
	
	public MetricsManager(IProject project) throws Exception{
		this.project = project;
		
		//Copying the java script libraries if they dont exist
		URL libFolderPath = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/libs");
		File libFolder = new File(FileLocator.resolve(libFolderPath).toURI());
        File projectFolder = new File(project.getLocation().toString());
        ProjectManagementServices.copyFolder(libFolder, projectFolder);
	}
}