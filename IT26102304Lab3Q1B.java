import java.util.Scanner;

public class IT26102304Lab3Q1B{
   
    public static void main (String[] args){
		
		double PricePerKg , quantity , totalamount , totDiscount, finalAmount ;
		double discount =0.10;
		
		
		Scanner input = new Scanner (System.in);
		
		
	    System.out.println("Enter the price of 1kg Rice:");
		
		PricePerKg = input.nextDouble();
		
		
		System.out.println("Enter the no of kilograms you want to buy:");
		quantity = input.nextDouble();
		
		totalamount= quantity * pricePerKg;
		totDiscount= totalamount * discount;
		finalAmount= totalamount - discount
		
		
		System.out.println("the toatal amount is"+ totalamount);
		
		System.out.println("the toatal amount after 10% discount"+ finalAmount);

	}

}	

  

   