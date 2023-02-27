package week2.day1;

public class Mobile {
	public void on() {
		  System.out.println("on");
	  }
	  public void openmessage() {
		  System.out.println("openmessage");
	  }
	  public void sendmessage() {
		  System.out.println("sendmessage");
	  }
	  public void closemeaage() {
		  System.out.println("closemessage");
	  }
	  
	 public void offphone() {
		 System.out.println("offphhone");
	 }
	 public void shareDocument() {
		 System.out.println("shareDocument");
	 }
	 public void openDocument() {
		 System.out.println("openDocument");
	 }
public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.on();
	mob.openmessage();
	mob.sendmessage();
	mob.closemeaage();
	mob.offphone();
	mob.shareDocument();
	mob.openDocument();
}
}
