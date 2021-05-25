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
	public final String PASSWORD = "Hello World!"; // Vulnerable code , do not declare password  which is security issue.CWE-259
	public static String username = "vsathvik";  //CWE-500.Public Static Field Not Marked Final.
private static String[] colors = {"WHITE"};
	
	public final  static String[] color = {"RED"};
	public App() {
	}

	public static void foo(long l) {

		for (int i = 0; i < l; i++) {
			// do something
		}
	}
	
	public String[] getColors() {
		return colors; // Cannot return private array from public method. CWE-495
	}

	

	public static void main(String[] args) {

		boolean isValid = false;
		
		if(isValid = true) { // Incorrect boolean comparision , CWE-481
			
			System.out.println("Incorrect boolean check");			
		}
		
		App app = new App();
         
		System.out.println(app.getColors().length);
		if (app.getClass().getName().contains("App")) { // CWE-486: Comparison of Classes by Name

			System.out.println("Incorrect Comparision");

		}

		String s = "Sathvik";
		String g = "Sathvik";

		System.out.println(s == g); // Incorrect comparision of strings equality.  CWE-597

		String val = "vulnn";
		try {

			int value = Integer.parseInt(val); // Incorrect parsing of Strings as integers. CWE-681
		} catch (NumberFormatException e) {
			log.info("Failed to parse val = " + val);
		}
		
		
		int num = 0;
		int num1 = 1;
		switch(num){ // Switch doesnt have default case which is incorrect. CWE-478
		
			case 1: System.out.println("1");
				break;
		
		}
		
		synchronized(app) { } // Do not keep empty synchronized blocks.CWE-585
		
		String cmd = System.getProperty("cmd");
                cmd = cmd.trim(); // Not sure of presence of cmd property in system, havent checked NPE.
		System.exit(1); // Do not use system exit. CWE-382: J2EE Bad Practices: Use of System.exit()

	}

	private final String getMessage() {
		return message;
	}
}
