package com.main;

import java.io.File;
import java.io.IOException;

import com.common.model.TextFileData;
import com.common.util.RespOrgTestProcessor;

public class RespOrgMainTest {

	public static void main(String[] args) throws IOException {
		String pathToFile = "C:\\Users\\Vinay kumar\\Desktop\\respOrg";
		File file = new File(pathToFile + "\\tifDoc.txt");
		
		System.out.println(file.getName());
		
		RespOrgTestProcessor processor = new RespOrgTestProcessor();
		TextFileData data = processor.process(file);
		
		System.out.println(data.getEmail());
	}

}
