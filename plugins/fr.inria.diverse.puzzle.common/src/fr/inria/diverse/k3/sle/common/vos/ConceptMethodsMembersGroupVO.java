package fr.inria.diverse.k3.sle.common.vos;

import java.util.ArrayList;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;

public class ConceptMethodsMembersGroupVO {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private JvmDeclaredType concept;
	private ArrayList<JvmOperation> methods;
	private ArrayList<String> memberGroup;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public ConceptMethodsMembersGroupVO(JvmDeclaredType concept){
		this.concept = concept;
		this.methods = new ArrayList<JvmOperation>();
		memberGroup = new ArrayList<String>();
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

	public ArrayList<JvmOperation> getMethods() {
		return methods;
	}

	public void setMethods(ArrayList<JvmOperation> methods) {
		this.methods = methods;
	}

	public ArrayList<String> getMemberGroup() {
		return memberGroup;
	}
	
	public String toString(){
		String members = "";
		for (String member : memberGroup) {
			members += member + ", ";
		}
		String methods = "";
		for (JvmOperation operation : this.methods) {
			methods += operation.getSimpleName() + "\n";
		}
		return concept.getSimpleName() + "." + methods + " - " + members;
	}
}