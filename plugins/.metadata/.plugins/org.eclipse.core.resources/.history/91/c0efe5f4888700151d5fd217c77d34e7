package fr.inria.diverse.puzzle.breaker.command;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;

import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class MetaclassAspectMapping {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private EClassifier metaclass;
	private ArrayList<AspectLanguageMapping> aspects;
	
	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public MetaclassAspectMapping(EClassifier metaclass){
		this.metaclass = metaclass;
		this.aspects = new ArrayList<AspectLanguageMapping>();
	}
	
	public MetaclassAspectMapping(EClassifier metaclass, Aspect aspect, Language language){
		this.metaclass = metaclass;
		this.aspects = new ArrayList<AspectLanguageMapping>();
		this.aspects.add(new AspectLanguageMapping(aspect, language));
	}
	
	// ----------------------------------------------
	// Getters and setters
	// ----------------------------------------------

	public EClassifier getMetaclass() {
		return metaclass;
	}
	
	public void setMetaclass(EClassifier metaclass) {
		this.metaclass = metaclass;
	}
	
	public ArrayList<AspectLanguageMapping> getAspects() {
		return aspects;
	}
	
	public void setAspects(ArrayList<AspectLanguageMapping> aspects) {
		this.aspects = aspects;
	}
	
	// ----------------------------------------------
	// Methods
	// ----------------------------------------------
	
	public boolean equals(Object o){
		MetaclassAspectMapping mapping = (MetaclassAspectMapping) o;
		return mapping.getMetaclass().getName().equals(metaclass.getName());
	}
}
