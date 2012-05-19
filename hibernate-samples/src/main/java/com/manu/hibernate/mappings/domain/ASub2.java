package com.manu.hibernate.mappings.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "A_Sub2")
public class ASub2 {

	@Id
	@Column(name = "as2_id")
	@GeneratedValue
	private Integer as2Id;

	@Column(name = "sub_name")
	private String subName;

	@ManyToOne
	private AMain parent;

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

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return " ASub2 with Id:" + as2Id + " Name:" + subName + " Parent:"
				+ parent;
	}

}
