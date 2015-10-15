package fr.inria.diverse.puzzle.metrics;

import java.util.ArrayList;

import fr.inria.diverse.melange.metamodel.melange.Language;

public class FamilyDSLs {

	// ------------------------------------------------
	// Attributes
	// ------------------------------------------------

	private ArrayList<Language> members;
	private int SoC;
	
	// ------------------------------------------------
	// Constructor
	// ------------------------------------------------
	
	public FamilyDSLs(){
		this.members = new ArrayList<Language>();
	}

	// ------------------------------------------------
	// Getters and setters
	// ------------------------------------------------
	
	public ArrayList<Language> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Language> members) {
		this.members = members;
	}

	public int getSoC() {
		return SoC;
	}

	public void setSoC(int soC) {
		SoC = soC;
	}
}