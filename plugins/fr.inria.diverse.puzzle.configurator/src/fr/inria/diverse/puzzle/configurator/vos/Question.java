package fr.inria.diverse.puzzle.configurator.vos;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Object representing a question for a FAMA features model. 
 * @author Jose A. Galindo
 *
 */
import fr.inria.diverse.puzzle.configurator.vos.Option.State;

public class Question {
	
	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	
	private Collection<Option> options;
	
	private String name;
	
	// --------------------------------------------------
	// Constructor
	// --------------------------------------------------

	public Question(String name){
		this.name=name;
		this.options=new LinkedList<>();
	}

	// --------------------------------------------------
	// Methods
	// --------------------------------------------------
	
	public boolean hasUndecided() {
		for(Option o:options){
			if(o.getState() == State.undecided){
				return true;
			}
		}
		return false;
	}

	// --------------------------------------------------
	// Getters and setters
	// --------------------------------------------------
	
	public Collection<Option> getOptions() {
		return options;
	}

	public void setOptions(Collection<Option> options) {
		this.options = options;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}