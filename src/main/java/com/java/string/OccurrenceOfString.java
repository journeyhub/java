package com.java.string;

public class OccurrenceOfString {
	/**
     *  1. Occurrence of a substring in a given string.
     *  2. Frequency of a Substring program
     * 
     * 
     * Example : 
     * Given String : "dhimanman"
     * substring : man
     * output count : 2
     * 
     * indexOf(man,0)
     * dhimanman
     * 012345678
     * 
     */

	public int frequencyOfSubStr(String mainString , String subStr) {
		int count = 0; // 1 + 1 = 2
		int index = 0;  // 3+3 = 6 + 9 
		
		while((index = mainString.indexOf(subStr, index)) != -1) {
			count++;
			index  += subStr.length();
		}
		return count;
	}
	
	
 
	public static void main(String[] args) {
		OccurrenceOfString obj = new OccurrenceOfString();
		int frequncyOfSubStr = obj.frequencyOfSubStr("yoyooyo", "yo");
		System.out.println("frequncyOfSubStr is "+frequncyOfSubStr);
	}

}
