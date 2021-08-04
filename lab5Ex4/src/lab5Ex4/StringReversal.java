//Christina Sosa

//Programming Fundamentals - Summer 2021

//Lab 5 - Exercise 4



package lab5Ex4; 

import java.util.Scanner;



public class StringReversal {



	public static void main(String[] args) {

		// Creating the s StringReversal variable

		StringReversal s = new StringReversal();

		Scanner scan = new Scanner(System.in);



		// Entering the string to be scanned and assigned to the str variable

		System.out.print("Enter the string: ");

		String str = scan.nextLine();

		System.out.println("Reversed String: " + s.reverseString(str));



		scan.close();

	}



	// Creating the reverseString recursive method

	public String reverseString(String s) {

		// Creating the if loop to return the string reversed

		if (s.isEmpty()) {

			return s;

		}

		// This function takes the start of the string and puts it at the end, and then

		// calls reverse on the rest of the string. Then adds the strings together to

		// get the final result. 

		return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));

	}

}