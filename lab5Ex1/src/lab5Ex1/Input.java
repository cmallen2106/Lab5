//Christina Sosa
//Programming Fundamentals 
//Summer 2021

package lab5Ex1;
import java.io.FileNotFoundException; 
import java.io.*;
import java.util.Scanner;



public class Input {

	public static void main(String args[]) throws FileNotFoundException {
		
		//Scanning the csv file to pull values
		Scanner scan = new Scanner(new File("/Users/christina/Desktop/Input.csv"));
		
		//Initializing the variables
		String line = " ";
		int max = 0;
		int count = 1;

		System.out.println("Maximum values");

		while(scan.hasNext()){
		
		//scanning each line
		line = scan.nextLine();
		
		//Splitting the row by each comma
		String[] a = line.split(",");
		max = 0;

		//this for loop parses each row for the max and assigns it
		for(int i=0; i < a.length; i++){
		    
		if(Integer.parseInt(a[i]) > max)
		max = Integer.parseInt(a[i]);
		}

		//Printing out the max for each row
		System.out.println("ROW " + count + " : " + max);
		count++;
		}
		scan.close();
	}

}
