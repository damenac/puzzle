package interpreters

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import fsm.FsmPackage
import fsm.StateMachine

import static extension fr.inria.diverse.puzzle.examples.fsm.semantics.StateMachineAspect.*

class Interpreter {

	new() {
	}

	def eval(String modelPath) {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(FsmPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, FsmPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()

		var uri = URI.createFileURI(modelPath);
		var res = rs.getResource(uri, true);
		var StateMachine stateMachine = res.contents.get(0) as StateMachine
		stateMachine.eval()
	}
	
	def static void main(String[] args){
		(new Interpreter()).eval('models/citizenWatch.xmi')
	}
}
