import java.util.Scanner;

public class IT26102304Lab3Q2 {
	public static void main(String[]args){
		
		Scanner mm = new Scanner (System.in);
		
	double otamount , othrs , tsalary , msalary , othrlyrate ;
	
	System.out.println("Enter the monthly salary:");
	msalary = mm.nextDouble();
	
	System.out.println("Enter the number of OT hours:");
	othrs = mm.nextDouble();
	
	System.out.println("Enter the OT hourly rate:");
	othrlyrate = mm.nextDouble();
	
	otamount = othrs * othrlyrate;
	tsalary = msalary + otamount;
		
	System.out.println("The total salary including OT is:" +tsalary);		
		
	}
	
}