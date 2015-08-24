package fr.inria.diverse.k3.sle.common.utils;

import java.io.File;
import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.mapping.MappingRoot;
import org.eclipse.emf.mapping.ecore2ecore.Ecore2EcorePackage;
import org.eclipse.emf.mapping.ecore2ecore.util.Ecore2EcoreResourceFactoryImpl;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class ModelUtils {

//	private static Injector injector = new K3SLEXtendStandaloneSetup()
//		.createInjectorAndDoEMFRegistration();
	
	// --------------------------------------------------
	// Methods
	// --------------------------------------------------

	/**
	 * Loads a model located in the xmi file in the parameter
	 * 
	 * @param filePath
	 * @return The root object of the model
	 */
	public static EObject loadXMIFile(String filePath) {
		ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl());
		
		URI fileURIResource0 = URI.createFileURI(filePath);
		Resource ecoreResource = rs.getResource(fileURIResource0, true);
		EcoreUtil.resolveAll(ecoreResource);
		return ecoreResource.getContents().get(0);
	}
	
	/**
	 * Loads a model located in the xmi file in the parameter
	 * 
	 * @param filePath
	 * @return The root object of the model
	 */
	public static EObject loadEcore2EcoreFile(String filePath, EPackage input, EPackage output) {
		ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore2ecore", new Ecore2EcoreResourceFactoryImpl());

		rs.getPackageRegistry().put(Ecore2EcorePackage.eNS_URI, Ecore2EcorePackage.eINSTANCE);
		
		rs.getPackageRegistry().put(input.getNsURI(), input);
		rs.getPackageRegistry().put(output.getNsURI(), output);
		
		URI fileURIResource0 = URI.createFileURI(new File(filePath).getAbsolutePath());
		Resource ecoreResource = rs.getResource(fileURIResource0, true);
		EcoreUtil.resolveAll(rs);
		EcoreUtil.resolveAll(ecoreResource);
		return ecoreResource.getContents().get(0);
	}
	
	/**
	 * Loads a model located in the ECORE file in the parameter
	 * 
	 * @param filePath
	 * @return The root object of the model
	 */
	public static EPackage loadEcoreFile(String filePath) {
		ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl());

		File file = new File(filePath);
		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		Resource ecoreResource = rs.getResource(fileURI, true);
		EcoreUtil.resolveAll(ecoreResource);
		
		return (EPackage) ecoreResource.getContents().get(0);
	}
	
	/**
	 * Loads a model located in the ECORE file in the parameter
	 * 
	 * @param filePath
	 * @return The root object of the model
	 */
	public static EPackage loadEcoreResource(String filePath) {
		ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl());

		URI fileURI = URI.createURI(filePath);
		Resource ecoreResource = rs.getResource(fileURI, true);
		EcoreUtil.resolveAll(ecoreResource);
		
		return (EPackage) ecoreResource.getContents().get(0);
	}
	
	/**
	 * Loads a Xtend file from the resource in the parameter
	 * @param filePath
	 * @return The root object of the model
	 * @throws IOException
	 */
	public static XtextResource loadXtendFile(String filePath) throws IOException {
		XtextResourceSet set = new XtextResourceSet();
		((XtextResourceSet) set).setClasspathURIContext(URLClassLoader
				.getSystemClassLoader());

		XtextResource res = (XtextResource) set.getResource(
				org.eclipse.emf.common.util.URI.createFileURI(filePath), true);
		EcoreUtil.resolveAll(res);
		
		return res;
	}
	
	/**
	 * Saves the epackage in the parameter in the specified path.
	 * 
	 * @param path
	 * @param rootPackage
	 */
	public static void saveEcoreFile(String path, EPackage rootPackage) {
		ResourceSet metaResourceSet = new ResourceSetImpl();

		metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new XMLResourceFactoryImpl());

		Resource metaResource = metaResourceSet.createResource(URI
				.createFileURI(path));
		
		metaResource.getContents().add(rootPackage);

		try {
			metaResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Saves the binding in the parameter in a .ecore2ecore file.
	 * @param path
	 * @param binding
	 */
	public static void saveEcore2EcoreFile(String path, MappingRoot binding){
		ResourceSet metaResourceSet = new ResourceSetImpl();

		metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put("ecore2ecore", new Ecore2EcoreResourceFactoryImpl());
		
		Resource metaResource = metaResourceSet.createResource(URI
				.createFileURI(path));
		
		metaResource.getContents().add(binding);

		try {
			metaResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveXMIFile(EObject root, String path){
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // create a resource
	    Resource resource = resSet.createResource(URI
	        .createFileURI(path));
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(root);

	    // now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
//	/**
//	 * Serializes an Xtend file in the file path given in the parameter
//	 * @param filePath
//	 * @param rootResource
//	 * @throws IOException
//	 */
//	public static void saveXtendFile(String filePath, Resource rootResource)
//			throws IOException {
//		XtextResourceSet set = injector.getInstance(XtextResourceSet.class);
//		Resource resource = (Resource) set
//				.createResource(org.eclipse.emf.common.util.URI
//						.createFileURI(filePath));
//		EList<EObject> toAdd = new BasicEList<EObject>();
//		for (EObject _object : rootResource.getContents()) {
//			toAdd.add(_object);
//		}
//		resource.getContents().addAll(toAdd);
//		resource.save(null);
//	}
	
	/**
	 * Loads an XML document from the file path in the parameter. 
	 * @param file File path of the document to load. 
	 * @return
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	public static Document loadXMLDocument(String file) throws SAXException, IOException, ParserConfigurationException{
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse (new File(file));
		return doc;
	}
	
	public static GenModel createGenModel(EPackage rootPackage, String ecoreLocation, 
			String modelDirectory, String modelPluginID, String genmodelLocation){
		
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
        genModel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
        genModel.setModelDirectory(modelDirectory);
        genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
        genModel.setModelName(rootPackage.getName());
        genModel.initialize(Collections.singleton(rootPackage));
		
		ResourceSetImpl resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(genmodelLocation));
		resource.getContents().add(genModel);
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return genModel;
	}
	
	
	
	public static void generateCode(GenModel genModel) {
		genModel.reconcile();
		genModel.setCanGenerate(true);
		genModel.setValidateModel(true);

		Generator generator = GenModelUtil.createGenerator(genModel);
		generator.generate(
			genModel,
			GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
			new BasicMonitor());
	}
}