package week2.day1;

public class Car {
	public void applyBreak() {
		System.out.println("applyBreak");
	}
	public void applyGear() {
		System.out.println("applyGear");
	}
	public void  switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void applyAcclerate() {
		System.out.println("applyAcclerate");
	}
	public void checkOilLevel() {
		System.out.println("checkOilLevel");
	}
	public  void checkTyrePressure() {
		System.out.println("checkTyrePresure");
	}
	public void checkCarBattery() {
		System.out.println("checkCarBattery");
	}
	public void checkTheSideMirror() {
		System.out.println("checkTheSideMirror");
	}
	public void checkTheFuelLevel() {
		System.out.println("checkTheFuelLevel");
	}
	
	public static void main(String[] args) {
		Car sportCar=new Car();
		sportCar.applyBreak();
		sportCar.applyGear();
		sportCar.switchOnAc();
		sportCar.applyAcclerate();
		sportCar.checkOilLevel();
		sportCar.checkTyrePressure();
		sportCar.checkCarBattery();
		sportCar.checkTheSideMirror();
		sportCar.checkTheFuelLevel();
	}
}
