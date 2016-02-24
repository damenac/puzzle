package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.extractor.impl.ExtractorImpl;
import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ReverseEngineeringReusableModulesBuilder extends AbstractBuilder {
  public void extractReusableModules(final Resource res, final IProject project, final IProgressMonitor monitor) {
    try {
      EList<EObject> _contents = res.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final ModelTypingSpace root = ((ModelTypingSpace) _head);
      ArrayList<Language> languages = new ArrayList<Language>();
      EList<Element> _elements = root.getElements();
      for (final Element element : _elements) {
        if ((element instanceof Language)) {
          languages.add(((Language) element));
        }
      }
      IProject lplProject = ProjectManagementServices.createEclipseEmptyProject("fr.inria.diverse.puzzle.reverseEngineering");
      this.decorateProjectWithFolderStructure(lplProject);
      SynthesisProperties properties = this.getSynthesisProperties();
      ExtractorImpl _instance = ExtractorImpl.getInstance();
      _instance.extractReusableModules(properties, languages, lplProject);
      ProjectManagementServices.refreshProject(lplProject);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Decorates the project in the parameter with the structure to contain a language product line
   * @param project. Project to decorate.
   */
  public String decorateProjectWithFolderStructure(final IProject project) {
    String _xblockexpression = null;
    {
      ProjectManagementServices.createFolderByName(project, "reports");
      _xblockexpression = ProjectManagementServices.createFolderByName(project, "models");
    }
    return _xblockexpression;
  }
}
