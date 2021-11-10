package com.azureBackand.springbootApplicatie;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
	private String voornaam;
	private String achternaam;
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	
}
