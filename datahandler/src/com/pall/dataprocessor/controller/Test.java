package com.pall.dataprocessor.controller;
import java.util.Scanner;

import com.pall.datahandler.util.StringHandler;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String line = scanner.nextLine();
		
		StringHandler handler = new StringHandler();
		Integer length = handler.stringCounter(line);
		System.out.println("Length of the String is " + length);
		String reverser = handler.stringReverse(line);
		System.out.println("Reverse of the String is " + reverser);
		 
	}
}
