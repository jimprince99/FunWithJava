package com.jimprince99.testers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

/**
 * Get the return string from the remote command
 * 
 */
public class OutputString implements Runnable {

	private InputStream inputStream;
	private Consumer<String> consumer;
	StringBuffer output = new StringBuffer();

	public OutputString(InputStream inputStream, Consumer<String> consumer) {
	        this.inputStream = inputStream;
	        this.consumer = consumer;
	    }

	@Override
	public void run() {
		new BufferedReader(new InputStreamReader(inputStream)).lines().forEach(consumer);
	}
	
	public StringBuffer getOutput() {
		return output;
	}

}
