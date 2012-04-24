package com.manu.hibernate.mappings.domain;

public class AParent {
	Integer parentId;
	Integer aId;
	String parentName;
	AMain one2oneSubA;
	
	
	
	public AParent(AMain one2oneSubA) {
		super();
		this.one2oneSubA = one2oneSubA;
	}
	public AParent() {
		
	}
	public AMain getOne2oneSubA() {
		return one2oneSubA;
	}
	public void setOne2oneSubA(AMain one2oneSubA) {
		this.one2oneSubA = one2oneSubA;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
}
