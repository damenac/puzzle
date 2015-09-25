package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.ArrayList;

import vm.PFeatureRef;

public class RightImplicationsGroup {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private PFeatureRef rightSide;
	
	private boolean notImplication;
	
	private ArrayList<PFeatureRef> leftSide;
	
	// -----------------------------------------------
	// Constructors
	// -----------------------------------------------
	
	public RightImplicationsGroup(PFeatureRef rightSide, boolean notImplication){
		this.rightSide = rightSide;
		this.notImplication = notImplication;
		this.leftSide = new ArrayList<PFeatureRef>();
	}

	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------
	
	public PFeatureRef getRightSide() {
		return rightSide;
	}

	public void setRightSide(PFeatureRef rightSide) {
		this.rightSide = rightSide;
	}

	public ArrayList<PFeatureRef> getLeftSide() {
		return leftSide;
	}
	
	public boolean isNotImplication() {
		return notImplication;
	}

	public void setNotImplication(boolean notImplication) {
		this.notImplication = notImplication;
	}
	
	// -----------------------------------------------
	// Methods
	// -----------------------------------------------

	public String toString(){
		String leftSide = "";
		boolean first = true;
		for (PFeatureRef pFeatureRef : this.leftSide) {
			if(!first)
				leftSide += " and";
			
			leftSide += " " + pFeatureRef.getRef().getName();
			first = false;
		}
		
		String not = "";
		if(this.notImplication)
			not = "not ";
		
		return "(" + leftSide + " ) implies " + not + rightSide.getRef().getName();
	}
	
	public boolean equals(Object o){
		RightImplicationsGroup group = (RightImplicationsGroup) o;
		boolean rightSideEqual = this.rightSide.getRef().getName().
				equals(group.rightSide.getRef().getName());
		boolean leftSideEqual = true;
		for (PFeatureRef pFeatureRef : leftSide) {
			if(!this.containsFeature(group.getLeftSide(), pFeatureRef)){
				leftSideEqual = false;
				break;
			}
		}
		return rightSideEqual && leftSideEqual && group.getLeftSide().size() == this.leftSide.size();
	}

	private boolean containsFeature(ArrayList<PFeatureRef> leftSide2,
			PFeatureRef pFeatureRef) {
		for (PFeatureRef feature : leftSide2) {
			if(feature.getRef().getName().equals(pFeatureRef.getRef().getName()))
				return true;
		}
		return false;
	}
}
