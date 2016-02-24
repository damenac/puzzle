package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.ArrayList;

import vm.BinaryExpression;
import vm.BooleanExpression;
import vm.LanguageFeatureRef;
import vm.UnaryExpression;

public class LeftImplicationsGroup {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private BooleanExpression leftSide;
	private ArrayList<BooleanExpression> rightSide;

	// -----------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------
	
	public LeftImplicationsGroup(BooleanExpression leftSide) {
		super();
		this.leftSide = leftSide;
		this.rightSide = new ArrayList<BooleanExpression>();
	}

	// -----------------------------------------------------------
	// Getters and setters
	// -----------------------------------------------------------
	
	public BooleanExpression getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(BooleanExpression leftSide) {
		this.leftSide = leftSide;
	}

	public ArrayList<BooleanExpression> getRightSide() {
		return rightSide;
	}
	
	// -----------------------------------------------------------
	// Methods
	// -----------------------------------------------------------
	
	public String toString(){
		String rightSide = "";
		boolean first = true;
		for (BooleanExpression expr : this.rightSide) {
			if(!first)
				rightSide += " and ";
			rightSide += this.stringRepresentation(expr);
			first = false;
		}
		return this.stringRepresentation(leftSide) + " implies " + rightSide;
	}
	
	private String stringRepresentation(BooleanExpression expr){
		if(expr instanceof BinaryExpression){
			BinaryExpression exprBinary = (BinaryExpression) expr;
			String operator = exprBinary.getOperator().getName();
			String leftSide = this.stringRepresentation(exprBinary.getLeft());
			String rightSide = this.stringRepresentation(exprBinary.getRight());
			return "( " + leftSide + " " + operator + " " + rightSide + " )";
		}
		else if(expr instanceof UnaryExpression){
			UnaryExpression exprUnary = (UnaryExpression)expr;
			String operator = exprUnary.getOperator().getName();
			String expression = this.stringRepresentation(exprUnary.getExpr());
			return "( " + operator + " " + expression + " )";
		}
		else if(expr instanceof LanguageFeatureRef){
			LanguageFeatureRef exprFeatureRef = (LanguageFeatureRef) expr;
			return exprFeatureRef.getRef().getName();
		}
		else{
			return null;
		}
	}
}