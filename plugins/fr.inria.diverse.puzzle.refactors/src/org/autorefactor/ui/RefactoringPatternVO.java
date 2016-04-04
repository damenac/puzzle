package org.autorefactor.ui;

public class RefactoringPatternVO {

	private String sourcePattern;
	private String targetPattern;
	private String pivotPattern;
	
	public String getSourcePattern() {
		return sourcePattern;
	}

	public void setSourcePattern(String sourcePattern) {
		this.sourcePattern = sourcePattern;
	}

	public String getTargetPattern() {
		return targetPattern;
	}

	public void setTargetPattern(String targetPattern) {
		this.targetPattern = targetPattern;
	}

	public boolean equals(Object target){
		RefactoringPatternVO _targetPattern = (RefactoringPatternVO) target;
		return _targetPattern.sourcePattern.equals(this.sourcePattern) && _targetPattern.targetPattern.equals(this.targetPattern);
	}

	public String getPivotPattern() {
		return pivotPattern;
	}

	public void setPivotPattern(String pivotPattern) {
		this.pivotPattern = pivotPattern;
	}
	
	
}
