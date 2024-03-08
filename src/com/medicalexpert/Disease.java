package com.medicalexpert;

public class Disease {
	private String name;
	private String description;
	private String treatment;

	public Disease(String name, String description, String treatment) {
		this.name = name;
		this.description = description;
		this.treatment = treatment;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getTreatment() {
		return treatment;
	}
}
