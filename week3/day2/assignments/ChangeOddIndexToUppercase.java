package week3.day2.assignments;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		
		String name="arunchiranjeevi";
		
		char[]ch=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
		if(i%2!=0)
		{	
		ch[i]=Character.toUpperCase(ch[i]);	
		}		
			
		}
	
		System.out.println(ch);	

	    }

}
