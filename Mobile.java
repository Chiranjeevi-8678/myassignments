package week1.day2;

public class Mobile {
	String mobileBrandName ="Realme";
	char mobileLogo ='R';
	short noOfMobilePiece =3;
	int modelNumber =867856;
	long mobileImeiNumber =80564608697871l;
	float mobilePrice =7800.25f;
	boolean isDamaged =false;
	public static void main(String[] args) {
		
	Mobile myMobile =new Mobile();
	System.out.println(myMobile.mobileBrandName);
	System.out.println("mobileLogo =" +myMobile.mobileLogo);
	System.out.println("noOfMobilepiece =" +myMobile.noOfMobilePiece);
	System.out.println("modelNumber=" +myMobile.modelNumber);
	System.out.println("mobileImelNumber=" +myMobile.mobileImeiNumber);
	System.out.println("mobilePrice =" +myMobile.mobilePrice);
	System.out.println("isDamaged=" +myMobile.isDamaged);
	
	
	}


}
