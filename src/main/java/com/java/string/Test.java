package com.java.string;

public class Test {

	public static void main(String[] args) {
		
		//Why String's is immutable in java
		String subject = "story";
		
		subject = subject + "books";
		
		System.out.println(subject);	
	}
	/**JVM
	Stack                         Heap
	             			String constant pool
	
	subject   101         101 ->      "story"
	subject   102         102 ->     "story books"
	
	*
	**/
	
	
}
