//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 5 Exercise 3

package lab5Ex3;
import java.util.Scanner; 

public class DivisorCalc {
	
	public static int gcd (int num1, int num2) {
		
		//Make sure that num1 is always greater than num2
		if (num1 < num2) {
			int temp = num1; 
			num1 = num2; 
			num2 = temp; 
		} 
		
		//if num2 divides num1 without remainder, gcd = num2
		if (num1 % num2 == 0) {
			return num2; 
		}
		
		//else get the remainder of num1/num2
		int remainder = num1 % num2; 
		
		return gcd(num2, remainder); 
	}

	public static void main(String[] args) {
		
		//Asking user for two integers and scanning numbers into num1 and num2
		
		Scanner scan = new Scanner (System.in);
		
		int num1, num2; 
		
		System.out.println("Enter two integers: "); 
		System.out.println("First Number: "); 
		num1 = scan.nextInt(); 
		
		System.out.println("Second Number: ");
		num2 = scan.nextInt(); 
		
		System.out.println("Greatest Common Divisor: " + gcd(num1, num2)); 
		
		scan.close();

	}

}
