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
	public final String PASSWORD = "Hello World!";
	public static String username = "vsathvik";

	public App() {
	}

	public static void foo(long l) {

		for (int i = 0; i < l; i++) {
			// do something
		}
	}
	
	

	public static void main(String[] args) throws Throwable {

		App app = new App();
                app.finalize();
		String s = "Sathvik";
		String g = "Sathvik";

		System.out.println(s == g);

		String val = "vulnn";
		try {

			int value = Integer.parseInt(val);
		} catch (NumberFormatException e) {
			log.info("Failed to parse val = " + val);
		}
		
		
		int num = 0;
		switch(num){
		
			case 1: System.out.println("1");
				break;
		
		}
		
		synchronized(this) { }
		
		System.exit(1);

	}

	private final String getMessage() {
		return message;
	}
}
