package com.spring.app.samplespringappchild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleSpringAppChildController {

	@GetMapping(path = "/")
	public String getBasePathResponse() {
		return "You called Child Base API !!!";
	}

	@GetMapping(path = "/child/hello")
	public String getHelloPathResponse(@RequestParam String name) {
		return "You Called Query Child Param API !!! "
				+ "Hello " + name;
	}
	
	@PostMapping(path = "/child/post/api")
	public String getPostResponse(@RequestBody Request request) {
		return "You called Child POST API to save id : " + request.getId() + " and Name : " + request.getName();
	}
}
