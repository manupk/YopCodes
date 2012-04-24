package com.manu.hibernate.mappings.domain;


public class BMain {
	Integer bId;
	String name;
	String prop1;
	String prop2;
	
	RefMain subRef;
	
	public BMain(String string) {
		this.name = string;
	}
	public RefMain getSubRef() {
		return subRef;
	}
	public void setSubRef(RefMain subRef) {
		this.subRef = subRef;
	}
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProp1() {
		return prop1;
	}
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
	public String getProp2() {
		return prop2;
	}
	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " BMain with Id:"+bId+" Name:"+name;
	}
}
