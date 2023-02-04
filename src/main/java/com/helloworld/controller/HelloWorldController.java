package com.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloWorld")
	public ResponseEntity<String> getHelloWorld()
	{
		return new ResponseEntity<>("HI What ur name",HttpStatus.OK);
	}
	
	@GetMapping("/getData")
	public ResponseEntity<List<String>> getData()
	{
		List<String> str= new ArrayList<>();
		str.add("audi");
		str.add("toyata");
		str.add("jeepsy");
		return new ResponseEntity<>(str,HttpStatus.OK);
	}


}
