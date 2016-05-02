package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.metrics.actions.PerformHierarchicalDomainAnalysisActionImpl;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Builder for the action: Perform Hierarchical Domain Analysis
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class PerformHierarchicalDomainAnalysisBuilder extends AbstractBuilder {
  /**
   * Delegates the analysis action to the metrics plug-in.
   */
  public void performAnalysis(final IResource res, final IProject project, final IProgressMonitor monitor) {
    try {
      IPath _location = res.getLocation();
      String _string = _location.toString();
      EPackage metamodel = ModelUtils.loadEcoreFile(_string);
      SynthesisProperties properties = this.getSynthesisProperties();
      this.decorateProjectWithFolderStructure(project);
      PerformHierarchicalDomainAnalysisActionImpl _instance = PerformHierarchicalDomainAnalysisActionImpl.getInstance();
      _instance.performDomainAnalysis(properties, metamodel, project);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Decorates the project in the parameter with the structure to store the reports
   * @param project. Project to decorate.
   */
  public String decorateProjectWithFolderStructure(final IProject project) {
    String _xifexpression = null;
    IFolder _folder = project.getFolder("reports");
    boolean _exists = _folder.exists();
    boolean _not = (!_exists);
    if (_not) {
      _xifexpression = ProjectManagementServices.createFolderByName(project, "reports");
    }
    return _xifexpression;
  }
}
