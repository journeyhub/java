package com.java.string;

import java.util.HashMap;
import java.util.Map;



/**
 * write a program to find out first non repeated character index of string
 *  madam
 *  example: Input: madam
 *           output: 2
 *  
 *  [ m , a , d , a , m] 
 *  
 *  for (char c : word.toCharArray()) {
 *  for (char c :   [ m , a , d , a , m] ) {
 * 
 * Map<Character, Integer> charCountMap = new HashMap<>();
 *          m       2
 *          a       1
 *          d       1
 *         
 *          
 *         

 * 
 * final map
 *  m 2
 *  a 2
 *  d 1
 *  
 *     map.get(m) = 2 
 *     map.getOrDefault(X,0) = 0;
 *     map.getOrDefault(d,0) = 1;
 *     
 *
 *
 *charCountMap.getOrDefault(m , 0) = 0;
 *
 *charCountMap.getOrDefault(m , 0)+1 = 1;
 *
 */
public class NonRepeatingFirstCharOfString {
	//madam
	public int firstNonRepeatingCharIndex(String word) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		// [ m , a , d , a , m] 
		for (char c : word.toCharArray()) {
			//     m getOrDefault(m, 0)
			charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
		}
		
		for(int i=0 ; i<word.length(); i++) {
			if(charCountMap.get(word.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		NonRepeatingFirstCharOfString object = new NonRepeatingFirstCharOfString();
		System.out.println("First non repeating char of string found at index : "+object.firstNonRepeatingCharIndex("baby"));
	}

}
