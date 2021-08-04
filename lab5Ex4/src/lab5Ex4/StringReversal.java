//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 5 Exercise 4

package lab5Ex4;
import java.util.Scanner; 

public class StringReversal {

	public static void main(String[] args) {
		
		//Asking user for two integers and scanning numbers into num1 and num2
		
		Scanner scan = new Scanner (System.in);
		
		int num1, num2; 
		
		System.out.println("Enter two integers: "); 
		System.out.println("First Number: "); 
		num1 = scan.nextInt(); 
		
		System.out.println("Second Number: ");
		num2 = scan.nextInt(); 
		
		System.out.println(" "); 
		
		scan.close();

	}

}
