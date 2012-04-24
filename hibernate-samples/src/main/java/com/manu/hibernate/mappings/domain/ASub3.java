package com.manu.hibernate.mappings.domain;

public class ASub3 {
	Integer as3Id;
	Integer aId;
	String subName;
	AMain parent;
	
	public ASub3(String name) {
		super();
		this.subName= name;
	}
	
	public ASub3() {
		super();
	}
	
	public AMain getParent() {
		return parent;
	}
	public void setParent(AMain parent) {
		this.parent = parent;
	}
	public Integer getAs3Id() {
		return as3Id;
	}
	public void setAs3Id(Integer as3Id) {
		this.as3Id = as3Id;
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
		return " ASub3 with Id:"+as3Id+" Name:"+subName+" Parent:"+parent;
	}

}
