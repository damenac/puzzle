package fr.inria.diverse.puzzle.metrics.chartMetrics;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Chart metric for the Pairwise Relationship Ratio (PWRR)
 * @author David Mendez-Acuna
 */
public class PairwiseRelationshipRatio implements ChartMetric {

	// ---------------------------------------------------
	// Methods
	// ---------------------------------------------------

	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator){
		String answer = "";
		ArrayList<TupleConceptMethodMember> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		
		for (Language languageI : languages) {
			EPackage ePackageI = MelangeServices.getEPackageFromLanguage(languageI);
			answer += "var barRelationshipRatio" + languageI.getName() + " = {\n";
			
			String labels = "";
			String dataForSyntax = "";
			boolean first = true;
			for (Language languageJ : languages) {
				
				EPackage ePackageJ = MelangeServices.getEPackageFromLanguage(languageJ);
				if(!languageI.getName().equals(languageJ.getName())){
					double currentValue = (((double)FamiliesServices.getIntersection(ePackageI, ePackageJ, conceptComparisonOperator).size()) / ((double)FamiliesServices.getUnion(ePackageI, ePackageJ).size()))*100;
					
					if(!first) labels += ",";
					labels += "\"" + languageJ.getName() + "\"";
					
					if(!first){
						dataForSyntax +=  ",";
					}
					dataForSyntax += currentValue;
					first = false;
					
				}
			}
			
			String dataForSemantics = "";
			first = true;
			for (Language languageJ : languages) {
				EPackage ePackageJ = MelangeServices.getEPackageFromLanguage(languageJ);
				if(!languageI.getName().equals(languageJ.getName())){
					double currentValue = (((double)getIntersection(conceptMethodMemberGroupList, languageI, languageJ, methodComparisonOperator).size()) / ((double)FamiliesServices.getUnion(ePackageI, ePackageJ).size()))*100;
					
					if(!first){
						dataForSemantics +=  ",";
					}
					dataForSemantics += currentValue;
					first = false;
					
				}
			}
			
			answer += "   labels : [" + labels + "],\n";
			answer += "   datasets : [\n";
			answer += "     {\n";
			answer += "        fillColor : \"rgba(220,220,220,0.5)\",\n";
			answer += "        strokeColor : \"rgba(220,220,220,0.8)\",\n";
			answer += "        highlightFill: \"rgba(220,220,220,0.75)\",\n";
			answer += "        highlightStroke: \"rgba(220,220,220,1)\",\n";
			answer += "        data : [" + dataForSyntax + "]\n";
			answer += "      },\n";
			answer += "      {\n";
			answer += "        fillColor : \"rgba(151,187,205,0.5)\",\n";
			answer += "        strokeColor : \"rgba(151,187,205,0.8)\",\n";
			answer += "        highlightFill : \"rgba(151,187,205,0.75)\",\n";
			answer += "        highlightStroke : \"rgba(151,187,205,1)\",\n";
			answer += "        data : [" + dataForSemantics + "]\n"; 
			answer += "      }\n";
			answer += "    ]\n";
			answer += "};\n";
		}
		
		return answer;
	}
	
	@Override
	public String getWindow(ArrayList<Language> languages){
		String answer = "";
		for (Language languageI : languages) {
			answer += "    var ctxRelationshipRatio" + languageI.getName() + " = document.getElementById(\"pie-relationship-ratio-" + languageI.getName() + "\").getContext(\"2d\");\n";
			answer += "    window.window.window.myBarRelationshipRatio" + languageI.getName() + " = new Chart(ctxRelationshipRatio" + languageI.getName() + ").Bar(barRelationshipRatio" + languageI.getName() + ", {\n";
			answer += "       responsive : false\n";
			answer += "    });\n\n";
		}
		return answer;
	}
	
	public String getTables(ArrayList<Language> languages){
		String answer = "";
		char index = 'a';
		for (Language languageI : languages) {
			answer += "                <table align=\"center\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"width:500px;\">\n";
			answer += "                    <tbody>\n";
			answer += "                        <tr>\n";
			answer += "                            <td style=\"text-align: center;\">\n";
			answer += "                                <div id=\"canvas-relationship-ratio-" + languageI.getName() + "\" width=\"150\" height=\"150\">\n";
			answer += "                                    <canvas id=\"pie-relationship-ratio-" + languageI.getName() + "\" width=\"450\" height=\"200\"/>\n";
			answer += "                                </div>\n";
			answer += "                            </td>\n";
			answer += "                        </tr>\n";
			answer += "                        <tr>\n";
			answer += "                            <td style=\"text-align: center;\">\n";
			answer += "                                <span style=\"font-family:lucida sans unicode,lucida grande,sans-serif;font-size:11px;\">\n";
			answer += "                                    <strong>Figure 7" + index + ".</strong></br>\n";
			answer += "                                    Pair-wise Relationship Ratio for " + languageI.getName() + "</br>\n";
			answer += "                                    ----\n";
			answer += "                                </span>\n";
			answer += "                            </td>\n";
			answer += "                        </tr>\n";
			answer += "                    </tbody>\n";
			answer += "                </table>\n";
			
			index++;
		}
		return answer;
	}
	
	// ---------------------------------------------------
	// Auxiliar Services
	// ---------------------------------------------------
	
	private ArrayList<String> getIntersection(
			ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList, Language languageI, Language languageJ,
			MethodComparison methodComparisonOperator) {

		String languageIName = MelangeServices.getEPackageFromLanguage(languageI).getName();
		String languageJName = MelangeServices.getEPackageFromLanguage(languageJ).getName();
		ArrayList<String> answer = new ArrayList<String>();
		for (TupleConceptMethodMembers conceptMethodMembersGroupVO : conceptMethodMemberGroupList) {
			boolean isInI = conceptMethodMembersGroupVO.getMembers().contains(languageIName);
			boolean isInJ = conceptMethodMembersGroupVO.getMembers().contains(languageJName);
			if(isInI && isInJ)
				answer.add(conceptMethodMembersGroupVO.getConcept().getSimpleName() + "." + conceptMethodMembersGroupVO.getMethod().getSimpleName());
		}
		return answer;
	}
}
