package assignment.week1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declare the two strings and give the values
		String str1="race";
		String str2="care";
		//find the length of string and store the values
		int length1 = str1.length();
		int length2 = str2.length();
		
		//if length1 and length2 are equal print "length are equal"
		if (length1 == length2) {
			System.out.println("length are equal");
		//else both are not equal print "not equal"
		}else {
			System.out.println("not equal");
			
		}
		// convert the strings into character
		char[]charArray1 = str1.toCharArray();
		char[]charArray2 = str2.toCharArray();
		
		//short the two arrays 
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(Arrays.toString(charArray1));
		System.out.println(Arrays.toString(charArray2));
		//check the values are true or false if the vlues are true print "true"
		  boolean equals = Arrays.equals(charArray1, charArray2);
		System.out.println(equals);
		
	}

}