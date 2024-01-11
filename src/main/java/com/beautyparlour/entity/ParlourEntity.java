package com.beautyparlour.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ParlourEntity")
public class ParlourEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="parlour_name")
	private String parlour_name;
	@Column(name="location")
	private String location;
	@Column(name="fees")
	private int fees;
	public String getParlour_name() {
		return parlour_name;
	}
	public void setParlour_name(String parlour_name) {
		this.parlour_name = parlour_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}

}
