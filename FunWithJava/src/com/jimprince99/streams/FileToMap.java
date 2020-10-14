package com.jimprince99.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileToMap {

	static String THIS_FILE = "src/com/jimprince99/streams/FileToMape.java";
	
	public static void main(String[] arge) {
		
		Stream<String> lines = Files.lines(Paths.get(THIS_FILE));
		
		Map<String, Integer> map = 	new HashMap<>();
			
		map = lines.collect(Collectors.toMap(x -> x, x -> 1));
		
		lines.close();
		
	}

	public void getMap() {
		Stream<String> lines = Stream.empty();

		try {
			lines = Files.lines(Paths.get(THIS_FILE));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<Integer, String> theLines = new HashMap<>();
		int count = 0;
		theLines = lines
				.collect(Collectors.toMap(x -> count, line -> line));
		
		lines.close();
		
		for (int key : theLines.keySet())
		{
			System.out.println("lines[" + key + "] = " + theLines.get(key));
		}
		
		
		theLines.entrySet().stream()
		.forEach(System.out::println);

	}

}
