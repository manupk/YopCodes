package com.manu.hibernate.mappings.domain;

public class ASub2 {
	Integer as2Id;
	Integer aId;
	String subName;
	AMain parent;
	
	
	public ASub2(String subName) {
		super();
		this.subName = subName;
	}
	
	public ASub2() {
		super();
	}

	public AMain getParent() {
		return parent;
	}
	
	public void setParent(AMain parent) {
		this.parent = parent;
	}
	public Integer getAs2Id() {
		return as2Id;
	}
	public void setAs2Id(Integer as2Id) {
		this.as2Id = as2Id;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " ASub2 with Id:"+as2Id+" Name:"+subName+" Parent:"+parent;
	}

}
