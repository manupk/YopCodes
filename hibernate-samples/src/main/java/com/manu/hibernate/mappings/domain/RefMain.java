package com.manu.hibernate.mappings.domain;


public class RefMain {
	Integer refId;
	Integer aOrbId;
	String aOrbInd;
	String name;

	AMain parentA;
	
	public Integer getRefId() {
		return refId;
	}
	public void setRefId(Integer refId) {
		this.refId = refId;
	}
	public Integer getaOrbId() {
		return aOrbId;
	}
	public void setaOrbId(Integer aOrbId) {
		this.aOrbId = aOrbId;
	}
	public String getaOrbInd() {
		return aOrbInd;
	}
	public void setaOrbInd(String aOrbInd) {
		this.aOrbInd = aOrbInd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public AMain getParentA() {
		return parentA;
	}
	public void setParentA(AMain parentA) {
		this.parentA = parentA;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " RefMain with Id:"+refId+" Name:"+name+ " Parent Id:"+aOrbId+" Parent Name:"+ aOrbId;
	}

}
