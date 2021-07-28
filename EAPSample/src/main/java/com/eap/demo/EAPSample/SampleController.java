package com.eap.demo.EAPSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(path = "/sample/api")
	public String getResponse() {
		return "You called me !!!";
	}
	
}
