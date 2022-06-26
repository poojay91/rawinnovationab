package com.rawinnovation.task;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Create instance of  Palindrome class
		Palindrome palindrome = new Palindrome();		
		// Display message to user
		System.out.println("Enter the input String");		
		// Read value from command line
		Scanner scanner = new Scanner(System.in);
		String original = scanner.nextLine();		
		// Check original value 
		while (original.isBlank()) {
			//If original value is blank or null then this block will run
			System.out.println("Please enter the valid string");
			scanner = new Scanner(System.in);
			original = scanner.nextLine();
		}		
		// Check whether value palindrome or not
		boolean isPalindrome = palindrome.isPalindrome(original.trim());
		// Check value whether it's true or false
		String result = isPalindrome ? "" : " not";
		// Display message to user
		System.out.println("String is" + result + " Palindrome");
	}

	// Function to check palindrome
	public boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		// Reversing string value and storing into reverse variable
		String reverse = sb.reverse().toString();
		// Check the value it's equal to original value
		if (str.equalsIgnoreCase(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
