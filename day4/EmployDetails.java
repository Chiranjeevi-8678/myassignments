package week2.day4;

public class EmployDetails {
	public void addEmployDetails(String employName,int employId) {
		System.out.println("EmployName="+employName);
		System.out.println("EmployID="+employId);
	}
	public void getEmployeAddress(String employeAdress) {
		System.out.println("Employe Adress="+employeAdress);
	}
	public void printEmployeSalary(double employeSalary ) {
		System.out.println("EmployeSalary="+employeSalary);
	}
	public void employeMobileNumber(long mobileNumber) {
		System.out.println("employeMobileNumber="+mobileNumber);
	}
public static void main(String[] args) {
	EmployDetails  employeDetails=new EmployDetails();
	employeDetails.addEmployDetails("chiranjeevi",78716745);
	employeDetails.getEmployeAddress("No.19,TNHB,Kakalur,thiruvallur");
	employeDetails.printEmployeSalary(78000);
	employeDetails.employeMobileNumber(7871674504l);
}
}
