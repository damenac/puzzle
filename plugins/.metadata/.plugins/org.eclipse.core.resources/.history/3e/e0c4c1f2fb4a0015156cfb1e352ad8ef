package fr.inria.diverse.k3.sle.common.tuples;

import org.eclipse.emf.ecore.EClassifier;

public class ConceptMemberVO {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private EClassifier concept;
	private String memberName;

	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public ConceptMemberVO(EClassifier concept, String memberName) {
		super();
		this.concept = concept;
		this.memberName = memberName;
	}
	
	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------
	
	public EClassifier getConcept() {
		return concept;
	}
	
	public void setConcept(EClassifier concept) {
		this.concept = concept;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString(){
		return this.memberName + " - " + this.concept.getName();
	}
}