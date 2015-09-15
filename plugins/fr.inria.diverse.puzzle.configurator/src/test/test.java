package test;
import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
import es.us.isa.FAMA.models.FAMAfeatureModel.fileformats.XMLReader;
import es.us.isa.FAMA.models.variabilityModel.parsers.WrongFormatException;
import fr.inria.diverse.puzzle.configurator.Configurator;

public class test {

	public static void main(String[] args) throws WrongFormatException {
		// TODO Auto-generated method stub
		XMLReader reader = new XMLReader();
		FAMAFeatureModel parseFile = (FAMAFeatureModel) reader.parseFile("./aircraft_fm.fm");
		
		Configurator facade = new Configurator();
		facade.configure(parseFile);
		
	}

}
