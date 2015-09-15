package fr.inria.diverse.puzzle.configurator.vos;

import java.util.Collection;
import java.util.LinkedList;

import es.us.isa.FAMA.models.FAMAfeatureModel.Feature;
import fr.inria.diverse.puzzle.configurator.vos.Option.State;

/**
 * Object representing a particular configuration for a FAMA features model. 
 * @author Jose A. Galindo
 *
 */
public class Configuration {
	
	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	
	public Collection<Question> questions;

	// --------------------------------------------------
	// Constructor
	// --------------------------------------------------
	
	public Configuration() {
		this.questions = new LinkedList<Question>();
	}

	// --------------------------------------------------
	// Methods
	// --------------------------------------------------
	
	public es.us.isa.FAMA.stagedConfigManager.Configuration getFAMAConfiguration() {
		es.us.isa.FAMA.stagedConfigManager.Configuration conf = new es.us.isa.FAMA.stagedConfigManager.Configuration();

		for (Question q : questions) {
			for (Option o : q.getOptions()) {
				if (o.getState() == State.selected) {
					conf.addElement(new Feature(o.getName()), 1);
				} else if (o.getState() == State.deselected) {
					conf.addElement(new Feature(o.getName()), 0);
				} else if (o.getState() == State.undecided) {
					// do nothing
				}
			}
		}
		return conf;
	}

	public void setOption(Feature f, Boolean b) {
		for (Question q : questions) {
			for (Option o : q.getOptions()) {
				if (o.getName().equals(f.getName())) {
					if (b == null) {
						o.setState(State.undecided);
					} else if (b) {
						o.setState(State.selected);
					} else if (!b) {
						o.setState(State.deselected);
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		String returnStr = "";
		for (Question q : questions) {
			for (Option o : q.getOptions()) {
				returnStr += o.getName() + "=";
				if (o.getState() == State.selected) {
					returnStr += "selected";
				} else if (o.getState() == State.deselected) {
					returnStr += "deselected";
				} else if (o.getState() == State.undecided) {
					returnStr += "undecided";
				}
				returnStr += "\n";
			}

		}
		return returnStr;
	}
}
