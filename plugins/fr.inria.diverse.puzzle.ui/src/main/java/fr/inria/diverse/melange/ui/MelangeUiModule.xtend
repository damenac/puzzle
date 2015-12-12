package fr.inria.diverse.melange.ui

import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.ui.plugin.AbstractUIPlugin
import fr.inria.diverse.melange.ui.internal.PuzzleActivator

class MelangeUiModule extends AbstractMelangeUiModule
{
	new(AbstractUIPlugin plugin) {
		super(plugin)
	}

	def static void logErrorMessage(String message, Throwable e) {
		PuzzleActivator.getInstance.log.log(
			new Status(
				IStatus::ERROR,
				PuzzleActivator.getInstance.bundle.symbolicName,
				IStatus::ERROR, message,
				e
			)
		)
	}
}
