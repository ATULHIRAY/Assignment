package com.qsp.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Therapists {
	@Id
	private String therapistsId;
    private String name;
    private String number;
	public String getTherapistsId() {
		return therapistsId;
	}
	public void setTherapistsId(String therapistsId) {
		this.therapistsId = therapistsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Therapists() {
		super();
	}
}
