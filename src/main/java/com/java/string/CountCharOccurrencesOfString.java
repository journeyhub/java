package com.java.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountCharOccurrencesOfString {
	/**
	 * @question : Java Program to Count the Occurrences of Each Character in String
	 *  Example : racecar
	 *  Output:
	 *  character r : count 2
	 *  character a : count 2
	 *  character c : count 2
	 *  character e : count 1
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the input string");
		String userInput = scanner.nextLine();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character c : userInput.toCharArray()){
			map.put(c, 1+map.getOrDefault(c, 0));
		}
		
		for(Entry<Character, Integer> entry :map.entrySet()){
			System.out.println("Charcter "+entry.getKey()+" count "+entry.getValue());
		}
	}

}
