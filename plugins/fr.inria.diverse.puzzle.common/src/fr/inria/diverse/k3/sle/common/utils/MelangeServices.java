package fr.inria.diverse.k3.sle.common.utils;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Services for interacting with Melange scripts.
 * @author David Mendez-Acuna
 */
public class MelangeServices {

	// -----------------------------------------------
	// Methods
	// -----------------------------------------------
	
	/**
	 * Extracts the ePackage corresponding to a language in Melange. 
	 * @param language
	 * @return
	 */
	public static EPackage getEPackageFromLanguage(Language language){
		if(language.getSyntax() != null)
			return  ModelUtils.loadEcoreResource(language.getSyntax().getEcoreUri());
		else
			return null;
	}
	
	/**
	 * Extracts the list of ePackages from a list of Melange languages.
	 * @param languages
	 * @return
	 */
	public static ArrayList<EPackage> getEPackagesByALanguagesList(ArrayList<Language> languages){
		ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
		for (Language language : languages) {
			if(language.getSyntax() != null){
				EPackage currentPackage = ModelUtils.loadEcoreResource(language.getSyntax().getEcoreUri());
				ePackages.add(currentPackage);
			}
		}
		return ePackages;
	}
}
