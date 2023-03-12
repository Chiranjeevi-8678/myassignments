package assignment.week1;

public class IntersectionTwoArrays {
	public static void main(String[] args) 
	{
				//Declare two arrays
				int a[]= {21,71,11,80,6,90,2};
				int b[]= {21,2,80,4,9,71};
				
				
				//Declare nested for loop to traverse the two arrays
				
				
				for(int i=0;i<a.length;i++)
				{
				
				for(int j=0;j<b.length;j++)
				{
				//Compare the values of two arrays 
				if(a[i]==b[j])
				//print the output
				System.out.print(a[i]+" ");
					}
				}

	}

}
