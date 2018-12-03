package com.resporg.app.controller;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.SchedulerTask;
import com.resporg.orm.RespService;

@RestController
public class SampleRestController {

	@Autowired
	private RespService respService;
	
	Timer timer = null;
	
	TimerTask task = null;
	
	@RequestMapping("/greet")
	public String greetMe() {
		return respService.processTestData();
	}
	
	@RequestMapping("/start")
	public String start() {
		if(timer == null && task ==null ) {
			timer = new Timer();
			task = new SchedulerTask();
			timer.schedule(task, 100, 2000); 
		} else {
			return "Timer is already started";
		}
		
		return "";
	}
	
	@RequestMapping("/stop")
	public String stop() {
		timer.cancel();
		timer = null;
		task = null;
		return "";
	}
}
