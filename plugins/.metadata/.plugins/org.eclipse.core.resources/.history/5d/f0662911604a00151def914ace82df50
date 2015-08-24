package fr.inria.diverse.k3.sle.common.vos;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;

public class ConceptMethodMemberVO {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private JvmDeclaredType concept;
	private JvmOperation method;
	private String memberName;

	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public ConceptMethodMemberVO(JvmDeclaredType concept, JvmOperation method, String memberName) {
		this.concept = concept;
		this.method = method;
		this.memberName = memberName;
	}
	
	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------
	
	public JvmDeclaredType getConcept() {
		return concept;
	}
	
	public void setConcept(JvmDeclaredType concept) {
		this.concept = concept;
	}
	
	public JvmOperation getMethod() {
		return method;
	}

	public void setMethod(JvmOperation method) {
		this.method = method;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString(){
		return this.memberName + " - " + this.concept.getSimpleName();
	}
}