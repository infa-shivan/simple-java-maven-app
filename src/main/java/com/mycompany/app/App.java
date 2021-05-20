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
	private final String PASSWORD = "Hello World!";

	public App() {
	}

	public static void foo(long l) {

		for (int i = 0; i < l; i++) {
			// do something
		}
	}

	public static void main(String[] args) {

		String s = "Sathvik";
		String g = "Sathvik";

		System.out.println(s == g);

		String val = "vulnn";
		try {

			int value = Integer.parseInt(val);
		} catch (NumberFormatException e) {
			log.info("Failed to parse val = " + val);
		}
		
		System.exit(1);

	}

	private final String getMessage() {
		return message;
	}
}
