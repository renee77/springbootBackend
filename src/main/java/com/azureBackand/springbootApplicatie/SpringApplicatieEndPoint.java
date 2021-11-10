package com.azureBackand.springbootApplicatie;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge=3600)
public class SpringApplicatieEndPoint {
	@GetMapping("endpoint1")
	public Person daarGaanWe() {
		Person w = new Person();
		w.setAchternaam("Bouwman");
		w.setVoornaam("Eva");
		return w;
	}
	
	@PostMapping("endpoint1")
	public void savePerson(@RequestBody Person p) {
		System.out.println("Hoi " + p.getVoornaam());
	}
	
}
