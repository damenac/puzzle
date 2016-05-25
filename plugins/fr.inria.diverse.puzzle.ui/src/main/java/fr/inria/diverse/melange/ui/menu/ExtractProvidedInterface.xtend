package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Display
import fr.inria.diverse.melange.ui.builder.ExtractProvidedInterfaceBuilder

/**
 * Handler for the action: Compose language modules
 * @author David Mendez-Acuna
 */
class ExtractProvidedInterface extends AbstractHandler {
	
	@Inject ExtractProvidedInterfaceBuilder builder

	override execute(ExecutionEvent event) throws ExecutionException {
		new Job("Puzzle: Extract provided interface ...") {
			override run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Extracting provided interface", 4)

					val sel = HandlerUtil.getActiveMenuSelection(event)
					val selection = sel as IStructuredSelection
					val resource = selection.firstElement as IResource
					val project = resource.project
					val ecoreResource = selection.firstElement as IResource
					
					builder.extractProvidedInterface(ecoreResource, project, monitor)

					display.syncExec(
						  new Runnable() {
						    override void run(){
						     MessageDialog.openInformation(display.activeShell, "Provided interface successfully extracted", "Provided interface successfully extracted");
						    }
						  });
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
	
	def static Display getDisplay() {
      var Display display = Display.getCurrent();
      //may be null if outside the UI thread
      if (display == null)
         display = Display.getDefault();
      return display;		
   }
}