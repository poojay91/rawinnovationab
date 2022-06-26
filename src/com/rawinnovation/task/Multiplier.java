package com.rawinnovation.task;

import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {
		// Create instance of Multiplier class
		Multiplier multiplier = new Multiplier();
		// Display message to user
		System.out.println("Enter the comma separated input numbers");		
		// Read value from command line
		Scanner scanner = new Scanner(System.in);
		String original = scanner.nextLine();
		// Spliting values and converting into array
		String arr[] = original.split(",");
		// Displaying number of counts
		System.out.println(multiplier.multiply(arr));
	}

	// Function to check multiplication 
	public int multiply(String a[]) {
		int count = 0;
		int value = 0;
		// Iterating number to check all numbers
		for (int i = 0; i < a.length; i++) {
			// Try to parse string value into number
			try {
				value = Integer.parseInt(a[i]);
			} catch (NumberFormatException exception) {
				// Display message to user when value is not a number
				System.out.println("Please enter valid number");
				throw new RuntimeException("Please enter valid number");
			}
			// Check the value whether it's multiplier of 4 or 6
			if (value != 0 && (value % 4 == 0 || value % 6 == 0)) {
				count++;
			}
		}
		// Return the number of counts
		return count;
	}
}
