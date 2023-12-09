package com.codingdojo.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physicien extends User implements HIPAACompliantUser {
	
	// Member Variables
	private ArrayList<String> patientNotes;
	
	// Contructor
	public Physicien(Integer id) {
		super(id);
	}
	
	// Interface Methods implementation
	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length() == 4) {
			return true;
		} else {
			return false;
			}
		}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.getId() == confirmedAuthID) {
			return true;
		}
		return false;
	}
	
	// Methods belongs to the Class
	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s \n", this.id);
		report += String.format("Patient Name: %s \n", patientName);
		report += String.format("Notes %s \n", notes);
		this.patientNotes.add(report);		
	}
	
	// Getters & Settrers
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	

}
