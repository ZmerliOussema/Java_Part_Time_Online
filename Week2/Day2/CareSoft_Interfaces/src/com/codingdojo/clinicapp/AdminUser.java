package com.codingdojo.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
	
	// Member Variables
    private String role;
    private ArrayList<String> securityIncidents;
    
    // Constructor
    public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
	}
    
    // Methods belongs to the Class
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        this.securityIncidents.add(report);
    }
	
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        this.securityIncidents.add(report);
    }
    
    // Interfaces Methods Implementation
	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length() == 6) {
			return true;
		} else {
			return false;
			}
		}
	

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.getId() == confirmedAuthID) {
			return true;
		} else {
		this.authIncident();
		return false;}
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		
		return this.securityIncidents;
	}
	
	// Gettrs & Setters
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
    


}
