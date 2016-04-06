package fr.inria.diverse.k3.sle.common.vos;

import java.util.ArrayList;

public class PackageAspectsMapping {

	private String pack;
	
	private ArrayList<String> aspects;

	public PackageAspectsMapping(String pack){
		this.pack = pack;
		aspects = new ArrayList<String>();
	}
	
	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public ArrayList<String> getAspects() {
		return aspects;
	}

	public void setAspects(ArrayList<String> aspects) {
		this.aspects = aspects;
	}
	
	public boolean equals(Object o){
		PackageAspectsMapping ob = (PackageAspectsMapping) o;
		return ob.pack.equals(this.pack);
	}
}
