package com.manu.hibernate.mappings.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The Main class A.
 */
@Entity
@Table(name = "A_Main")
public class AMain {

	@Id
	@Column(name = "a_id")
	@GeneratedValue
	private Integer aId;

	@Column(name = "name")
	private String name;
	@Column(name = "prop1")
	private String prop1;
	@Column(name = "prop2")
	private String prop2;

	@OneToOne(mappedBy="parent")
	private ASub1 one2oneSubA1;
	@Transient
	Set<ASub2> subSets;
	@Transient
	List<ASub3> subList;
	@Transient
	RefOnlyAMain one2oneSubRef;

	public AMain(String name) {
		this.name = name;
	}

	public AMain(Integer aId, String name) {
		this.aId = aId;
		this.name = name;
	}

	public AMain() {
	}

	public AMain(List<ASub3> subList) {
		super();
		this.subList = subList;
	}

	public RefOnlyAMain getOne2oneSubRef() {
		return one2oneSubRef;
	}

	public void setOne2oneSubRef(RefOnlyAMain one2oneSubRef) {
		this.one2oneSubRef = one2oneSubRef;
	}

	public List<ASub3> getSubList() {
		return subList;
	}

	public void setSubList(List<ASub3> subList) {
		this.subList = subList;
	}

	public Set<ASub2> getSubSets() {
		return subSets;
	}

	public void setSubSets(Set<ASub2> subSets) {
		this.subSets = subSets;
	}

	public ASub1 getOne2oneSubA1() {
		return one2oneSubA1;
	}

	public void setOne2oneSubA1(ASub1 one2oneSubA1) {
		this.one2oneSubA1 = one2oneSubA1;
	}

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
		return " AMain with Id:" + aId + " Name:" + name;
	}

}
