package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.puzzle.breaker.popup.actions.BreakDownFamilyImpl;
import fr.inria.diverse.puzzle.metrics.actions.ComputeMetricsActionImpl;
import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SyntaxBreakerBuilder {
  public void breakDownSyntax(final Resource res, final IProject project, final IProgressMonitor monitor) {
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
      BreakDownFamilyImpl _instance = BreakDownFamilyImpl.getInstance();
      _instance.breakDownFamily(languages);
      ComputeMetricsActionImpl _instance_1 = ComputeMetricsActionImpl.getInstance();
      _instance_1.computeMetrics(root, project);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
