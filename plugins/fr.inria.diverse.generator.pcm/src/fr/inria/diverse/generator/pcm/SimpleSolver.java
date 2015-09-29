package fr.inria.diverse.generator.pcm;
import static choco.Choco.eq;
import static choco.Choco.gt;
import static choco.Choco.implies;
import static choco.Choco.makeIntVar;

import java.util.HashMap;
import java.util.Map;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.kernel.solver.variables.integer.IntDomainVar;

public class SimpleSolver {

	Map<String,IntegerVariable> variables ;
	Model p ;
	
	public SimpleSolver(){
		p = new CPModel();
		variables = new HashMap<String,IntegerVariable>();
	}
	
	public void createMandatory(String feature) {
		p.addConstraint(eq(variables.get(feature),1));
	}

	private IntegerVariable createVariable(String feature){
		int[] domain = {0,1};
		IntegerVariable var = makeIntVar(feature, domain);
		variables.put(feature, var);
		return var;
	}
	
	private IntegerVariable getVariable(String feature){
		if(variables.containsKey(feature)){
			return variables.get(feature);
		}else{
			return createVariable(feature);
		}
	}
	
	public void createRequires(String from, String to){		
		IntegerVariable originVar = getVariable(from);
		IntegerVariable destinationVar = getVariable(to);
		Constraint requiresConstraint = implies(gt(originVar, 0), gt(destinationVar, 0));
		p.addConstraint(requiresConstraint);
	}
	
	public void createExcludes(String from, String to){		

		IntegerVariable originVar = getVariable(from);
		IntegerVariable destinationVar = getVariable(to);
		Constraint excludesConstraint = implies(gt(originVar, 0), eq(destinationVar, 0));
		p.addConstraint(excludesConstraint);
	}
		
	public String solve(){
		String PCM = "\"Product\",";
		Solver solver = new CPSolver();
		solver.read(p);
		
		for(int i = 0; i < p.getNbIntVars(); i ++) {
			PCM +=  solver.getVar(p.getIntVar(i)).getName() + ",";
		}
		
		PCM += "\n";
		
		int n=0;
		if (solver.solve() == Boolean.TRUE && solver.isFeasible()) {
		  do {
			  PCM += "\"P" + (n++) + "\",";
			  for(int i = 0; i < p.getNbIntVars(); i ++) {
				  IntDomainVar aux = solver.getVar(p.getIntVar(i));
				  if(aux.getVal()>0){
					  PCM += "\"YES\",";
				  }else{
					  PCM += "\"NO\",";
				  }
			  }
			  PCM += "\n";
		  } while(solver.nextSolution() == Boolean.TRUE);
		}
		return PCM;
	}
}
