package fr.inria.diverse.puzzle.breaker.vos;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;

public class ModuleConceptsVO {

	private String moduleName;
	
	private ArrayList<EClassifier> concepts;
	
	private String members;

	public ModuleConceptsVO(String moduleName, String members) {
		this.moduleName = moduleName;
		this.members = members;
		this.concepts = new ArrayList<EClassifier>();
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public ArrayList<EClassifier> getConcepts() {
		return concepts;
	}
	
	public String getMembers() {
		return members;
	}

	public void setMembers(String members) {
		this.members = members;
	}

	public String toString(){
		String concepts = "";
		for (EClassifier eClassifier : this.concepts) {
			concepts += eClassifier.getName() + ", ";
		}
		return this.moduleName + " - " + concepts;
	}
}
