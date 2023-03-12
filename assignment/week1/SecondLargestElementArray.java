package assignment.week1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementArray {
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("enter the elements");
		//array using the scanner class
		int c=ch.nextInt();
		//declaring the  array into num
		int num[]=new int[c];
		//array using for loop
		for (int i = 0; i <c; i++) {
			
		num[i]=ch.nextInt();
		
		}
		//Sort the array elements in ascending order using sort
		Arrays.sort(num);
		//printing the second largest element
		System.out.println("second largest element in array is "+num[c-21]);
	}

}
