package com.dkte;
import java.util.*;
class Calculator{
	private int beginbalance=0;
	private int charges;
	private int credits=0;
	private int newbalance=0;
	
	 static Scanner sc =new Scanner(System.in);
	 
	 public void acnumber() {
			System.out.println("Enter the valid account number : ");
			int ac = sc.nextInt();	
		}
	public void accpectrecord()
	{
		
			System.out.println("Enter the beginning balance :  ");
			beginbalance =sc.nextInt();
			
			System.out.println("Enter the charges og the bank :  ");
			charges=sc.nextInt();
			
			System.out.println("Enter the credits amount :  ");
			credits=sc.nextInt();
			
			
			newbalance=beginbalance+charges-credits;
	}
	
	public void displayInfo() {
		
		System.out.println("beginning balance is  :  "+beginbalance);
		System.out.println("the charges of the bank : "+charges);
		System.out.println("The credits amount is :  "+credits);
		System.out.println(" New balance is  :  "+newbalance);
	}
	
}
public class CreditLimit {

	public static void main(String[] args) {
			Calculator c =new Calculator();
			c.acnumber();
			c.accpectrecord();
			c.displayInfo();
	}

}