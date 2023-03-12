package assignment.week1;

public class ReverseString {
	public static void main(String[] args) {
		//declare the string
		String str="testleaf";
		//output is faeltset
		System.out.println("String="+str);
		System.out.println("Reverse String");
		//converting the string into arrays
		char[]ch=str.toCharArray();
		//itterate the arrays in reverse order using for loop
		
		for (int i = ch.length-1; i >=0; i--) {
			//Print the output
			System.out.println(ch[i]);
			
		}
	}

}
