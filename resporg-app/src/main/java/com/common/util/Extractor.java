package com.common.util;

public class Extractor {

	private String data;

	public Extractor(String data) {
		this.data = data;
	}
	
	public String extractText(String begin, String end) {
		String val = data.substring(data.indexOf(begin) + begin.length(), data.indexOf(end));
		return val;
	}
}
