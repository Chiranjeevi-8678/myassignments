package assignment.week1;

import java.util.Scanner;

public class Fact {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		//Get input from the user using scanner class
		int n=sc.nextInt();
		//Declare the variable  fact with value 1
		int fact=1;
		//Iterate the  reverse order using for loop
		for(int i=n;i>0;i--)
		{
			//Calculate the factorial and store the  fact variable
			fact=fact*i;
		}
		//Print the output fact
		System.out.println(fact);
	}

}
