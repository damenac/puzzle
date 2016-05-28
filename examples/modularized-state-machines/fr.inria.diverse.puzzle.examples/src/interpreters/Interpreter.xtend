package interpreters

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import CompleteDSLPckg.CompleteDSLPckgPackage
import CompleteDSLPckg.StateMachine

import static extension CompleteDSL.StateMachineAspect.*

class Interpreter {

	new() {
	}

	def eval(String modelPath) {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(CompleteDSLPckgPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(CompleteDSLPckgPackage.eNS_URI, CompleteDSLPckgPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()

		var uri = URI.createFileURI(modelPath);
		var res = rs.getResource(uri, true);
		var StateMachine stateMachine = res.contents.get(0) as StateMachine;
		stateMachine.eval() 
	}
	
	def static void main(String[] args){
		(new Interpreter()).eval('models/citizenWatch-2.xmi')
	}
}
