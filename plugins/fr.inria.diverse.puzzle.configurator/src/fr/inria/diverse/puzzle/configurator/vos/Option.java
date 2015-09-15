package fr.inria.diverse.puzzle.configurator.vos;

/**
 * Object representing an option for a FAMA features model. 
 * @author Jose A. Galindo
 *
 */
public class Option {
	
	// --------------------------------------------------
	// Constants
	// --------------------------------------------------
	
	public enum State{selected,deselected,undecided}
	
	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	
	private String name;
	private State state;
	
	// --------------------------------------------------
	// Constructor
	// --------------------------------------------------
	
	public Option(String name) {
		this.name=name;
		this.state=State.undecided;
	}

	// --------------------------------------------------
	// Getters and setters
	// --------------------------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
