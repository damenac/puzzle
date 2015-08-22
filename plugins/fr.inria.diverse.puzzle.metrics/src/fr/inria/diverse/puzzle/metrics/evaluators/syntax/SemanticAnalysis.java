package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodMemberVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodMembersGroupVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodsMembersGroupVO;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class SemanticAnalysis {

	public static String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator){
		String answer = "";
		ArrayList<ConceptMethodMemberVO> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<ConceptMethodMembersGroupVO> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		ArrayList<ConceptMethodsMembersGroupVO> conceptsGroupMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodsMembersGroupVOList(conceptMethodMemberGroupList, conceptComparisonOperator, methodComparisonOperator);
		
		answer += "var treeData = [\n";
		answer += "    {";
		answer += "    \"name\": \"Family\",\n";
		answer += "    \"parent\": \"null\",\n";
		answer += "    \"children\": [\n";
		
		boolean firstLevel0 = true;
		for (ConceptMethodsMembersGroupVO conceptMethodMembersGroupVO : conceptsGroupMethodMemberGroupList) {
			if(!firstLevel0) answer += ",\n";
			//FIXME
			String conceptName = conceptMethodMembersGroupVO.getConcept().getSimpleName().replace("Aspect", "");
			answer += "          {\n";
			answer += "          \"name\": \"" + conceptName + "\",\n";
			answer += "          \"parent\": \"Family\"";
			if(conceptMethodMembersGroupVO.getMethods().size() > 0){
				answer += ",\n";
				answer += "          \"children\": [\n";
				boolean firstLevel1 = true;
				for (JvmOperation operation : conceptMethodMembersGroupVO.getMethods()) {
					if(!firstLevel1) answer += ",\n";
					String operationSignature = operation.getReturnType().getSimpleName() + " " 
													+ operation.getSimpleName() + "(";
					for (JvmFormalParameter param : operation.getParameters()) {
						operationSignature += param.getParameterType().getSimpleName() + " ";
					}
					operationSignature += ") [from:";
					
					for (String member : conceptMethodMembersGroupVO.getMemberGroup()) {
						operationSignature += " " + member;
					}
					operationSignature += "]";
					
					answer += "               {\n";
					answer += "               \"name\": \"" + operationSignature + "\",\n";
					answer += "               \"parent\": \"" + conceptName + "\"\n";
					answer += "               }";
					firstLevel1 = false;
				}
				answer += "\n";
				answer += "              ]\n";
			}else{
				answer += "\n";
			}
			answer += "          }";
			firstLevel0 = false;
		}
		answer += "\n";
		answer += "     ]\n";
		answer += "    }\n";
		answer += "];\n";
		
		return answer;
	}
}
