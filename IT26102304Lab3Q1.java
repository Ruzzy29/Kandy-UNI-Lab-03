
import java.util.Scanner;

public class IT26102304Lab3Q1{
   
    public static void main (String[] args){
		
		double PricePerKg , quantity , totalamount ;
		
		Scanner input = new Scanner (System.in);
		
		
	    System.out.println("Enter the price of 1kg Rice:");
		
		PricePerKg = input.nextDouble();
		
		
		System.out.println("Enter the no of kilograms you want to buy:");
		quantity = input.nextDouble();
		
		totalamount= quantity*PricePerKg;
		
		System.out.println("the toatal amount is"+ totalamount);
		

	}
}           