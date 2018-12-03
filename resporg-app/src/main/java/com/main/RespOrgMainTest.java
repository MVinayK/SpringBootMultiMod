package com.main;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class RespOrgMainTest {

	public static void main(String[] args) throws IOException {
		/*String pathToFile = "C:\\Users\\Vinay kumar\\Desktop\\respOrg";
		File file = new File(pathToFile + "\\tifDoc.txt");
		
		System.out.println(file.getName());
		
		RespOrgTestProcessor processor = new RespOrgTestProcessor();
		TextFileData data = processor.process(file);
		
		System.out.println(data.getEmail());*/
		
		Timer timer = new Timer();
		
		TimerTask task = new SchedulerTask();
		
		//Takes a task starts after the 2nd argument and repeat interval is the 3rd argument
		timer.schedule(task, 1000, 2000);
		
		
		
	}

}
