package com.manu.hibernate.mappings.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "A_Sub1")
public class ASub1 {

	@Id
	@Column(name = "as1_id")
	@GeneratedValue
	private Integer as1Id;

	@Column(name = "a_id", insertable = false, updatable = false)
	private Integer aId;

	@Column(name = "sub_name")
	private String subName;

	@OneToOne
	private AMain parent;

	public ASub1(String subName) {
		this.subName = subName;
	}

	public ASub1() {
	}

	public AMain getParent() {
		return parent;
	}

	public void setParent(AMain parent) {
		this.parent = parent;
	}

	public Integer getAs1Id() {
		return as1Id;
	}

	public void setAs1Id(Integer as1Id) {
		this.as1Id = as1Id;
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
		return " ASub1 with Id:" + as1Id + " Name:" + subName + " Parent:"
				+ parent;
	}

}
