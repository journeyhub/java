package com.java.string;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SkipAndLimit {

	public static void main(String[] args) throws IOException {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream()
			.skip(1)
			.limit(5)
			.forEach(System.out::print);
		
		System.out.println("\n"+"=========================================");
		List<String> fileData = Files.readAllLines(Paths.get("data.txt"));
		fileData.stream()
			.skip(1)
			.limit(fileData.size()-2)
			.forEach(System.out::println);
	}
	

}
