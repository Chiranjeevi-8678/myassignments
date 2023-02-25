package week1.day2;

public class TwoWheller {
	int noOfWheels =2;
	short noOfMirrors =2;
	long chassisNumber =7871674504l;
	boolean isPunctured =false;
	String bikeName ="Pulsar";
	double runningKM =19999.9;
 public static void main(String[] args) {
  
	 TwoWheller myBike =new TwoWheller();
	 System.out.println(myBike.bikeName);
	 System.out.println("noOfMirrors=" +myBike.noOfMirrors);
	System.out.println("chassissNumber=" +myBike.chassisNumber);
	System.out.println("noOfWheels=" +myBike.noOfWheels);
	System.out.println("punctured=" +myBike.isPunctured);
	System.out.println("runningKM=" +myBike.runningKM);
	
	 
}
}