package assignment.week1;

import java.util.Scanner;

public class PrintOddNumber {
	public static void main(String[] args) {
		
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the name ");
		//get the input range in the scanner
		int start=ch.nextInt();
		int  end=ch.nextInt();
		System.out.println("Odd number with the range ");
		//iterate the given range
		for (int i =start; i <=end; i++) {
			
			//check the odd or not 
 			if (i%2==1) {
				System.out.print(i+", ");	
			}
			
			
		}
		
	}

}
