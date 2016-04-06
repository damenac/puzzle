package fr.inria.diverse.melange.ui.builder;

import PuzzleADL.LanguageArchitecture;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.derivator.impl.IDerivator;
import fr.inria.diverse.puzzle.derivator.impl.PuzzleDerivator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import vm.LanguageProductLine;

/**
 * Builder for the action: Configure.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class DeriveLanguageFromConfigurationBuilder extends AbstractBuilder {
  /**
   * Derives a language from a configured variability model and a language architecture model.
   * @param res. Array containing the references to the files with the models.
   * @param project. The project that contains the files with the models.
   * @param monitor. Progress monitor to the Eclipse interface.
   */
  public void deriveLanguageFromConfigurationBuilder(final Object[] res, final IProject project, final IProgressMonitor monitor) {
    try {
      Object _get = res[0];
      IResource resource0 = ((IResource) _get);
      Object _get_1 = res[1];
      IResource resource1 = ((IResource) _get_1);
      LanguageProductLine configuredFeatureModel = null;
      LanguageArchitecture languageArchitectureModel = null;
      IPath _location = resource0.getLocation();
      String _string = _location.toString();
      boolean _endsWith = _string.endsWith("vm");
      if (_endsWith) {
        IPath _location_1 = resource0.getLocation();
        String _string_1 = _location_1.toString();
        EObject _loadXMIFile = ModelUtils.loadXMIFile(_string_1);
        configuredFeatureModel = ((LanguageProductLine) _loadXMIFile);
      } else {
        IPath _location_2 = resource0.getLocation();
        String _string_2 = _location_2.toString();
        boolean _endsWith_1 = _string_2.endsWith("puzzleadl");
        if (_endsWith_1) {
          IPath _location_3 = resource0.getLocation();
          String _string_3 = _location_3.toString();
          EObject _loadXMIFile_1 = ModelUtils.loadXMIFile(_string_3);
          languageArchitectureModel = ((LanguageArchitecture) _loadXMIFile_1);
        } else {
        }
      }
      IPath _location_4 = resource1.getLocation();
      String _string_4 = _location_4.toString();
      boolean _endsWith_2 = _string_4.endsWith("vm");
      if (_endsWith_2) {
        IPath _location_5 = resource1.getLocation();
        String _string_5 = _location_5.toString();
        EObject _loadXMIFile_2 = ModelUtils.loadXMIFile(_string_5);
        configuredFeatureModel = ((LanguageProductLine) _loadXMIFile_2);
      } else {
        IPath _location_6 = resource1.getLocation();
        String _string_6 = _location_6.toString();
        boolean _endsWith_3 = _string_6.endsWith("puzzleadl");
        if (_endsWith_3) {
          IPath _location_7 = resource1.getLocation();
          String _string_7 = _location_7.toString();
          EObject _loadXMIFile_3 = ModelUtils.loadXMIFile(_string_7);
          languageArchitectureModel = ((LanguageArchitecture) _loadXMIFile_3);
        } else {
        }
      }
      IProject derivationProject = ProjectManagementServices.createEclipseJavaProject("fr.inria.diverse.puzzle.reverseEngineering.derivation");
      this.decorateProjectWithFolderStructure(derivationProject);
      IDerivator derivator = PuzzleDerivator.getInstance();
      derivator.derivateLangaugeFromConfiguration(derivationProject, languageArchitectureModel, configuredFeatureModel);
      ProjectManagementServices.refreshProject(derivationProject);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Decorates the project in the parameter with the structure to contain a configured language.
   * @param project. Project to decorate.
   */
  public String decorateProjectWithFolderStructure(final IProject project) {
    try {
      String _xblockexpression = null;
      {
        ProjectManagementServices.createXtendConfigurationFile(project, "derivation", false, "family");
        _xblockexpression = ProjectManagementServices.createFolderByName(project, "src/family");
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
