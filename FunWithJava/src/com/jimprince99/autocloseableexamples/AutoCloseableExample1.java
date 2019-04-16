package com.jimprince99.autocloseableexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AutoCloseableExample1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String file = "C:\\Users\\jpri1335\\git\\FunWithJava\\FunWithJava\\src\\com\\jimprince99\\HelloWorld\\HelloWorld.java";
		try (InputStream is = new FileInputStream(new File(file));
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);) {

			String read;
			while ((read = br.readLine()) != null) {
				System.out.println(read);
			}
		} 

	}

}
