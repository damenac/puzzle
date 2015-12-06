package fr.inria.diverse.k3.sle.common.vos;

import java.util.ArrayList;

import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class AspectLanguageMapping {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private Aspect aspect;
	private Language language;
	private ArrayList<Language> languagesObjectList;
	private String languagesList;
	
	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public AspectLanguageMapping(Aspect aspect, Language language){
		this.aspect = aspect;
		this.language = language;
		this.languagesObjectList = new ArrayList<Language>();
		this.languagesList = language.getName();
	}
	
	// ----------------------------------------------
	// Getters and setters
	// ----------------------------------------------

	public Aspect getAspect() {
		return aspect;
	}

	public void setAspect(Aspect aspect) {
		this.aspect = aspect;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public ArrayList<Language> getLanguagesObjectList() {
		return languagesObjectList;
	}

	public void setLanguagesObjectList(ArrayList<Language> languagesObjectList) {
		this.languagesObjectList = languagesObjectList;
	}

	public String getLanguagesList() {
		return languagesList;
	}

	public void setLanguagesList(String languagesList) {
		this.languagesList = languagesList;
	}
}