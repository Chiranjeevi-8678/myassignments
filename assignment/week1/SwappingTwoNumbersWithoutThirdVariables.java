package assignment.week1;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutThirdVariables {
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the number");
		//Get input from the user using scanner class
		int num=ch.nextInt();
		//Iterate using for loop
		for(int i=1;i<=10;i++)
		{ 
			//Multiply and store it in variable result
			int result=num*i;
			//Print the output
			System.out.println(i+"*"+num+"="+result);
		}

	}
}
