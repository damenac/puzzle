package flowchartpck

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension flowchartpck.FlowchartAspect.*

class Interpreter {

	new() {
	}

	def eval(String modelPath) {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(FlowchartpckPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(FlowchartpckPackage.eNS_URI, FlowchartpckPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()

		var uri = URI.createFileURI(modelPath);
		var res = rs.getResource(uri, true);
		var Flowchart flowchart = res.contents.get(0) as Flowchart
		flowchart.exec()
	}
	
	def static void main(String[] args){
		(new Interpreter()).eval('models/ToyFlowchart.xmi')
	}
}
