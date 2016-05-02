package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider
import fr.inria.diverse.melange.ui.builder.PerformLanguagesAnalysisBuilder

/**
 * Hanlder for the action: Analyze Family
 * @author David Mendez-Acuna
 */
class PerformLanguagesAnalysis extends AbstractHandler {
	
	@Inject PerformLanguagesAnalysisBuilder builder
	@Inject XtextResourceSetProvider rsProvider

	override execute(ExecutionEvent event) throws ExecutionException {
		new Job("Puzzle: Perform languages analysis") {
			override run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Puzzle: Perform languages analysis", 4)

					val sel = HandlerUtil.getActiveMenuSelection(event)
					val selection = sel as IStructuredSelection
					val resource = selection.firstElement as IResource
					val project = resource.project
					val rs = rsProvider.get(project)
					val res = rs.getResource(URI::createPlatformResourceURI(resource.fullPath.toString, true), true) as DerivedStateAwareResource

					builder.computeMetrics(res, project, monitor)
					
				} catch (OperationCanceledException e) {
					return Status.CANCEL_STATUS
				} catch (Exception e) {
					e.printStackTrace
					return Status.CANCEL_STATUS
				} finally {
					monitor.done
				}

				return Status.OK_STATUS
			}
		}.schedule
		return null
	}
}