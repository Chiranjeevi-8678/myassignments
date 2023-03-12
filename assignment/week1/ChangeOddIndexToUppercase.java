package assignment.week1;

import java.util.Iterator;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		//declare the string and assign the value 
		String str="testleaf";
		//print the out of str
		System.out.println(str);
		
		
		//convert the string into array 
		char []ch=str.toCharArray();
		
		//find the odd index in for loop
		for (int i = 0; i < ch.length; i++) {
			
			if (i%2==1);
			{
				//convert the char into uppercase
				ch[i]=Character.toUpperCase(ch[i]);
			}
			
			//print the output of ch in uppercase
			System.out.println(ch);
		}
		
		
		
		
	}

}
