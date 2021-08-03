//Christina Sosa
//Programming Fundamentals 
//Summer 2021

package lab5Ex1;
import java.io.FileNotFoundException; 
import java.io.File;
import java.util.Scanner;



public class Input {

	public static void main(String args[]) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("/Users/christina/Desktop/Input.csv")); 
		String line = ""; 
		
		int max = 0, count = 1; 
		String[] arr = null; 
		
		System.out.println("Maximum values"); 
		
		while(scan.hasNext()) {
			 
			line = scan.nextLine(); 
			arr = line.split(","); 
			max = 0;
			
			for(int i=0; i<arr.length; i++) {
				
				if(Integer.parseInt(arr[i]) > max)
					max = Integer.parseInt(arr[i]); 
				
			}
			
			System.out.println("ROW " + count + " : " + max); 
			count++;
			
		}
		
		

	}

}
