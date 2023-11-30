package com.java.string;

import java.util.Scanner;

/**
 * 
 * write a program to check, the user entered input string is Palindrome or not.
 * Example : madam, racecar , level , refer
 * word length 5
 *	madam = madam
 *
 */
public class Palindrome {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string to check the given string is palindrome or not");
		String userInput = scanner.nextLine();
		
		//level 
		//01234 
		String revString="";
		for(int i=userInput.length()-1; i>=0 ; i--){
			revString = revString+userInput.charAt(i);
		}
		if (userInput.equalsIgnoreCase(revString)) {
			System.out.println("Yes it is a palidrome string");
		} else {
			System.out.println(userInput+" not a paloidrome string "+ revString);
		}
	}
}
