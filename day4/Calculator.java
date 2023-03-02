package week2.day4;


public class Calculator {
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subtractNumber(int e,int f) {
		int c=e-f;
		System.out.println(c);
	}
	public void multipleTwoNumber(double i,double j) {
		double c=i*j;
		System.out.println(c);
	}
	public void divisionTwoNummber(float x,float y) {
		float c=x/y;
		System.out.println(c);
	}
	public static void main(String []args) {
		 Calculator calc=new  Calculator();
		 calc.addTwoNumber(10, 20);
		 calc.subtractNumber(15, 20);
		 calc.multipleTwoNumber(12345.25, 20252.31);
		 calc.divisionTwoNummber(10258.258f, 20258.235f);
		 
	}


}
