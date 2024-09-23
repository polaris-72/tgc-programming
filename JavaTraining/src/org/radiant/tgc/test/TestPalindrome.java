package org.radiant.tgc.test;



/**
 * Requirements
 */
//write a function/procedure that will take a text input and determine if the
//input is a palindrome. The user input cannot contain numbers or special characters 
//whitespace characters will be scrubbed from user text input. 
//

/**
 * VALID Inputs
 * */
//abba - even
//tacocat - odd
//aibohphobia
//a
// abc cba 

/**
 * INVALID Inputs
 * */
//anything
//123h321
//!237*1h
//!abcdba!
//12abccba21
// 
public class TestPalindrome {

	public static void main(String[] args) {
		
		System.out.print(isPalindrome("abc"));
	}
	
	
	static boolean isPalindrome(final String text) {
		
		System.out.println(text);		
		
		final int textLength = text.length();
		
		if (isEven(textLength)) {
			
			String startSegment = text.substring(0, ((textLength / 2) - 1));
			String endSegment = text.substring((textLength / 2), textLength - 1);
			
			
			//abba
			
			//a = 0
			//b = 1
			//b = 2
			//a = 3
			
		} else {
			
			
		}
		
		
		
		return false;
	}
	
	static String reverseString(final String text) {
		
		
		char[] textArr = text.toCharArray();
		
		return text;
		
		
	}
	
	static boolean isEven(final int number) {
		
		if (number % 2 == 1) {
			
			return true;
		}
		
		return false;
	}
	
}
