package com.manu.hibernate.mappings.domain;

public class AFamilyDTO {

	Integer aId;
	String name;
	
	Integer as1Id;
	String aSub1Name;
	
	public Integer getaId() {
		return aId;
	}



	public void setaId(Integer aId) {
		this.aId = aId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAs1Id() {
		return as1Id;
	}



	public void setAs1Id(Integer as1Id) {
		this.as1Id = as1Id;
	}



	public String getaSub1Name() {
		return aSub1Name;
	}



	public void setaSub1Name(String aSub1Name) {
		this.aSub1Name = aSub1Name;
	}



	@Override
	public String toString() {
		return "AMainDTO [" + (aId != null ? "aId=" + aId + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (as1Id != null ? "as1Id=" + as1Id + ", " : "")
				+ (aSub1Name != null ? "aSub1Name=" + aSub1Name : "") + "]";
	}
	
	
}
