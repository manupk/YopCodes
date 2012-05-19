package com.manu.hibernate.mappings.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "A_Sub3")
public class ASub3 {

	@Id
	@Column(name = "as3_id")
	@GeneratedValue
	private Integer as3Id;

	@Column(name = "sub_name")
	private String subName;

	@ManyToOne
	private AMain parent;

	public ASub3(String name) {
		super();
		this.subName = name;
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

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return " ASub3 with Id:" + as3Id + " Name:" + subName + " Parent:"
				+ parent;
	}

}
