package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.synthesizer.impl.SynthesizerManager;
import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Builder for the action: Synthesize Language Product Line (LPL).
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ReverseEngineeringLanguageProductLineBuilder extends AbstractBuilder {
  /**
   * Synthesizes a language product line from the family of DSLs described in the resource.
   */
  public void reverseEngineeringLanguageProductLine(final Resource res, final IProject project, final IProgressMonitor monitor) {
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
      IProject lplProject = ProjectManagementServices.createEclipseProject("fr.inria.diverse.puzzle.reverseEngineering");
      SynthesisProperties properties = this.getSynthesisProperties();
      SynthesizerManager _instance = SynthesizerManager.getInstance();
      _instance.synthesizeLanguageProductLine(properties, languages, lplProject);
      ProjectManagementServices.refreshProject(lplProject);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
