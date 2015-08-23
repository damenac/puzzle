package fr.inria.diverse.k3.sle.common.vos;

import java.util.ArrayList;

public class MembersGroupVsConceptVO {

	private String membersGroup;
	private ArrayList<String> concepts;
	
	public MembersGroupVsConceptVO(String membersGroup) {
		this.membersGroup = membersGroup;
		this.concepts = new ArrayList<String>();
	}
	
	public String getMembersGroup() {
		return membersGroup;
	}
	public void setMembersGroup(String membersGroup) {
		this.membersGroup = membersGroup;
	}
	
	public ArrayList<String> getConcepts() {
		return concepts;
	}

	public void setConcepts(ArrayList<String> concepts) {
		this.concepts = concepts;
	}

	public boolean equals(Object toCompare){
		MembersGroupVsConceptVO toCompareObject = (MembersGroupVsConceptVO) toCompare;
		return toCompareObject.membersGroup.equals(this.membersGroup);
	}
}