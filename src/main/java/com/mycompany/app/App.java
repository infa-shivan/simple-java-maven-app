package com.mycompany.app;

import java.io.*;
import java.io.FileReader;
import java.util.logging.Logger;

/**
 * Hello world!
 */
public class App {

	private static Logger log = Logger.getLogger(App.class.getName());
	private final String message = "Hello World!";
	public final String PASSWORD = "Hello World!"; // Vulnerable cod , do not declare password  which is security issue.
	public static String username = "vsathvik";

	public App() {
	}

	public static void foo(long l) {

		for (int i = 0; i < l; i++) {
			// do something
		}
	}
	
	

	public static void main(String[] args) {

		App app = new App();
         
		String s = "Sathvik";
		String g = "Sathvik";

		System.out.println(s == g); // Incorrect comparision of strings equality.

		String val = "vulnn";
		try {

			int value = Integer.parseInt(val); // Incorrect parsing of Strings as integers.
		} catch (NumberFormatException e) {
			log.info("Failed to parse val = " + val);
		}
		
		
		int num = 0;
		switch(num){ // Switch doesnt have default case which is incorrect.
		
			case 1: System.out.println("1");
				break;
		
		}
		
		synchronized(app) { } // Do not keep empty synchronized blocks.
		
		System.exit(1); // Do not use system exit.

	}

	private final String getMessage() {
		return message;
	}
}
