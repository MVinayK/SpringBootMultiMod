package com.common.util;

public class Extractor {

	private String data;

	public Extractor(String data) {
		this.data = data;
	}
	
	public String extractText(String begin, String end) {
		String val = "";
		try{ 
			val = data.substring(data.indexOf(begin) + begin.length(), data.indexOf(end));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("There is no data which begins with " + begin + " and ends with " + end);
		}
		return val;
	}
}
