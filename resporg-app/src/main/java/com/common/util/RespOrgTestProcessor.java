package com.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import com.common.model.FieldData;
import com.common.model.TextFileData;


public class RespOrgTestProcessor {

	public TextFileData process(File file) throws IOException {
		
		String str = getStringOut(file);
		System.out.println(str);
		Map<String, String> dataValues = new HashMap<>();
		Extractor extractor = new Extractor(str);
		EnumSet.allOf(FieldData.class).forEach(field -> {
			String value = extractor.extractText(field.getStartStr(), field.getEndStr());
			dataValues.put(field.getName(), value.trim());
		});
		
		dataValues.forEach((key, value) -> {
			System.out.println(key + "   " + value);
		});
		
		TextFileData fileData = createTextFileData(dataValues);
		
		return fileData;
	}

	private TextFileData createTextFileData(Map<String, String> dataValues) {
		TextFileData fileData = new TextFileData();

		dataValues.forEach((key, value) -> {
			if(key.equals("email")){
				fileData.setEmail(value);
			} else if(key.equals("name")) {
				fileData.setName(value);
			}
		});
		
		return fileData;
	}

	private String getStringOut(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(" ");
		}
		return stringBuilder.toString();
	}
}
