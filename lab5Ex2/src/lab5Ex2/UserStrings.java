//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 5 Exercise 2

package lab5Ex2;
import java.io.*;
import java.util.Scanner;

public class UserStrings {

	public static void main(String[] args) throws IOException {

		// Invoking the scanner system and creating the new .txt file to export to
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("UserStrings.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		// Line to enter string and scan
		System.out.println("Enter your string. Enter \"DONE\" when finished.");
		String user = scan.nextLine();

		// Creating this while loop to continuously keep printing to the .txt file; Done when "DONE" is typed
		while (!user.equals("DONE")) {
			outFile.write(user);
			System.out.println("Enter your string. Enter \"DONE\" when finished.");
			user = scan.nextLine();
			
			// Added the "IgnoreCase" to make the program take both methods of DONE.
			if (user.equalsIgnoreCase("DONE")) {
				outFile.close();
				break;
			}
		}
		scan.close();
		fw.close();
		bw.close();
		outFile.close();
	}
}

