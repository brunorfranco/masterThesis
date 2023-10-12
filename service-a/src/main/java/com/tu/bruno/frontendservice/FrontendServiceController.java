package com.tu.bruno.frontendservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontendServiceController {
	
	@GetMapping("/randomEntries")
	public ResponseEntity<RandomEntry[]> greeting() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8082/api/entries";
		ResponseEntity<RandomEntry[]> response
		  = restTemplate.getForEntity(fooResourceUrl, RandomEntry[].class);
		return response;
	}

}
