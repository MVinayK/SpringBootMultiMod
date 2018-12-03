package com.main;

import java.util.TimerTask;

public class SchedulerTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("I am running !!!");
	}
	
}
