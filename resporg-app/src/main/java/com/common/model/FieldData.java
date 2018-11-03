package com.common.model;

public enum FieldData {

	EMAIL("email", "AT&T E-Mail Address:", "Branch:"),
	NAME("name", "AT&T Name:", "Phone No:"),
	PHONE("phone", "Phone No:", "AT&T E-Mail Address:"),
	BRANCH("branch", "Branch:", "PRWT"),
	ADDRESS("address", "Aooiress: Address:", "AT&T Name:"),
	AUTHORIZED_BY("authorized", "Authorized By:", "{Signature"),
	NUMBERS("numbers", "Use pursuant to Company instructions", "Succesfully Converted");
	
	private final String name;
	private final String startStr;
	private final String endStr;
	
	private FieldData(String name, String start, String end)
	{
		this.name= name;
		this.startStr = start;
		this.endStr = end;
	}

	public String getName() {
		return name;
	}

	public String getStartStr() {
		return startStr;
	}

	public String getEndStr() {
		return endStr;
	}
	
}
