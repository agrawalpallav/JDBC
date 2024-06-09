package com.pall.datahandler.util;

public class StringHandler {
	
	public Integer stringCounter(String data) {
		return data.length();			
	}
	
	public String stringReverse(String data) {
		String value = "";
		for(int i=data.length()-1; i>=0; i--) {
			value = value + data.charAt(i);
		}
		return value;
	}

}
