package com.spring.app.samplespringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleSpringAppController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${api.host.baseurl}")
	private String apiHost;
	
	@GetMapping(path = "/")
	public String getBasePathResponse() {
	
		String url = "http://" + apiHost;
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		return response.getBody();
	}

}
