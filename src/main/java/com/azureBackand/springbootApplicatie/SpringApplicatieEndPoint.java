package com.azureBackand.springbootApplicatie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringApplicatieEndPoint {
	@GetMapping("endpoint1")
	public Person daarGaanWe() {
		Person w = new Person();
		w.setAchternaam("Bouwman");
		w.setVoornaam("Eva");
		return w;
	}
	
}
