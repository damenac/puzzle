package fr.inria.diverse.puzzle.configurator;

import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
import vm.PFeatureModel;

public class ConfigurationFacade {

	private static ConfigurationFacade instance;
	
	private ConfigurationFacade(){
		
	}
	
	public static ConfigurationFacade getInstance(){
		if(instance == null)
			instance = new ConfigurationFacade();
		return instance;
	}
	
	public void configure(PFeatureModel fetureModel){
		FAMAFeatureModel famaFeatureModel = FromPFeatureModelToFAMA.getInstance().fromPFeatureModelToFAMA(fetureModel);
		Configurator configurator = new Configurator();
		configurator.configure(famaFeatureModel);
	}
}
