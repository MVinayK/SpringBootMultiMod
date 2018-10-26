package com.resporg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resporg.orm.RespService;

@RestController
public class SampleRestController {

	@Autowired
	private RespService respService;
	
	@RequestMapping("/greet")
	public String greetMe() {
		return respService.processTestData();
	}
}
