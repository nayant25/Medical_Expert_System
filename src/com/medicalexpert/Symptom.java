package com.medicalexpert;

public class Symptom {
	    private String name;
	    private String response;

	    public Symptom(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getResponse() {
	        return response;
	    }

	    public void setResponse(String response) {
	        this.response = response;
	    }
	
}
