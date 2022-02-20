package com.qa.runner;

//imports go here (for packages)

public class HelloWorld {
	
	
	public static void printMessage(String fname) {
		String message = ", message received, world ;P!!";
		System.out.println(fname + message);
		
	}
	
	public static String printMessage() {
		return "Hello World";
	}
	public static void main(String[] args) {
		printMessage("Hello");
	}
	
}
