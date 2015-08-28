package fr.inria.diverse.puzzle.metrics.specialCharts;

import java.util.ArrayList;
import java.util.List;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.SemanticNode;
import fr.inria.diverse.k3.sle.common.tuples.SemanticTree;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodsMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleMethodMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class SemanticalVariabilityTree {

	public static String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator){
		String answer = "";
		ArrayList<TupleConceptMethodMember> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		
		ArrayList<TupleConceptMethodsMembers> conceptsGroupMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodsMembersGroupTupleList(conceptMethodMemberGroupList, conceptComparisonOperator, methodComparisonOperator);
		SemanticTree semanticTree = buildSemanticTree(conceptsGroupMethodMemberGroupList);
		SemanticTree newSemanticTree = refactorTreeToHighlightSemanticVariability(semanticTree);
		
		answer += "var treeData = [\n";
		String treeString = buildTreeString(newSemanticTree.getRoot());
		answer += treeString;
		answer += "];\n";
		
		return answer;
	}
	
	private static SemanticTree buildSemanticTree(ArrayList<TupleConceptMethodsMembers> conceptsGroupMethodMemberGroupList){
		SemanticTree tree = new SemanticTree();
		SemanticNode root = new SemanticNode("Family", "Family", null, "");
		tree.setRoot(root);
		
		for (TupleConceptMethodsMembers tupleConceptMethodsMembers : conceptsGroupMethodMemberGroupList) {
			SemanticNode conceptNode = new SemanticNode(tupleConceptMethodsMembers.getConcept().getSimpleName(), 
					tupleConceptMethodsMembers.getConcept().getSimpleName(), root, "");
			
			for (TupleMethodMembers methodMembers : tupleConceptMethodsMembers.getMethodsMembers()) {
				String members = "[from:";
				boolean first = true;
				for (String member : methodMembers.getMembers()) {
					if(!first) members += " ,";
					members += member;
					first = false;
				}
				members += "]";
				
				String nodeName = methodMembers.getMethod().getSimpleName() + " " + members;
				SemanticNode methodNode = new SemanticNode(methodMembers.getMethod().getSimpleName(), nodeName, conceptNode, members);
				conceptNode.getChilds().add(methodNode);
			}
			root.getChilds().add(conceptNode);
		}
		return tree;
	}
	
	private static SemanticTree refactorTreeToHighlightSemanticVariability(SemanticTree tree){
		SemanticTree newTree = new SemanticTree();
		SemanticNode root = new SemanticNode(tree.getRoot().getId(), tree.getRoot().getLabel(), null, tree.getRoot().getMembers());
		newTree.setRoot(root);
		
		for (SemanticNode conceptNode : tree.getRoot().getChilds()) {
			SemanticNode newConceptNode = new SemanticNode(conceptNode.getId(), conceptNode.getLabel(), root, conceptNode.getMembers());
			
			for (int i = 0; i < conceptNode.getChilds().size(); i++) {
				SemanticNode nodeI = conceptNode.getChilds().get(i);
				
				if(!methodAlreadyDone(newConceptNode.getChilds(), nodeI)){
					ArrayList<SemanticNode> variantsI = new ArrayList<SemanticNode>();
					for (int j = 0; j < conceptNode.getChilds().size(); j++) {
						SemanticNode nodeJ = conceptNode.getChilds().get(j);
						if((nodeI.getId().equals(nodeJ.getId()) && !(nodeI.getMembers().equals(nodeJ.getMembers()))) || i == j){
							if(!variantsI.contains(nodeJ))
								variantsI.add(nodeJ);
						}
					}
					if(variantsI.size() == 1){
						SemanticNode newMethodNode = new SemanticNode(variantsI.get(0).getId(), variantsI.get(0).getLabel(), newConceptNode, variantsI.get(0).getMembers());
						newConceptNode.getChilds().add(newMethodNode);
					}else if(variantsI.size() > 1){
						SemanticNode newMethodNode = new SemanticNode(variantsI.get(0).getId(), "+" + variantsI.get(0).getId(), newConceptNode, variantsI.get(0).getMembers());
						for (SemanticNode semanticNode : variantsI) {
							SemanticNode newMethodVariantNode = new SemanticNode(semanticNode.getId(), semanticNode.getLabel(), newMethodNode, semanticNode.getMembers());
							newMethodNode.getChilds().add(newMethodVariantNode);
						}
						newConceptNode.getChilds().add(newMethodNode);
					}
				}
			}
			root.getChilds().add(newConceptNode);
		}
		
		return newTree;
	}
	
	private static boolean methodAlreadyDone(List<SemanticNode> childs,
			SemanticNode nodeI) {
		for (SemanticNode semanticNode : childs) {
			if(semanticNode.getId().equals(nodeI.getId()))
				return true;
		}
		return false;
	}

	private static String buildTreeString(SemanticNode root) {
		String answer = "";
		answer += "          {\n";
		answer += "          \"name\": \"" + root.getLabel() + "\",\n";
		if(root.getParent() == null)
			answer += "          \"parent\": \"null\"";
		else
			answer += "          \"parent\": \"" + root.getParent().getLabel() + "\"";
		
		if(root.getChilds().size() != 0){
			answer += ",\n";
			answer += "          \"children\": [\n";
			boolean first = true;
			for (int i = 0; i < root.getChilds().size(); i++) {
				if(!first) answer += ",\n";
				answer += buildTreeString(root.getChilds().get(i));
				first = false;
			}
			answer += "              ]\n";
		}
		answer += "    }\n";
		return answer;
	}
}
