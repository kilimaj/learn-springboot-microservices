package dev.kilima.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;

//@Controller @ResponseBody
// The response body serializes java object to json
// The two annotations can now just use one annotation combining them
@RestController
public class HelloWorldController {

	// Http Get request
	// http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
