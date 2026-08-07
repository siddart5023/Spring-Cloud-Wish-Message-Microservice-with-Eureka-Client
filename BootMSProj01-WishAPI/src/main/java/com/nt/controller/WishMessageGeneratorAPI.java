package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMessageGeneratorAPI {
	
	@Value("${spring.application.name}")
	private String instance_id;
	
	@GetMapping("/message")
	public ResponseEntity<String> showwishMessage(){
		String msg="Good Morning"+instance_id;
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
