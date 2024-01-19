/**
 * 
 */
package org.ict.day2;

import java.util.Scanner;

import org.ict.practicequestion.SampleJavaPrograms;

/**
 * 
 */
public class CompoundInterest {

	/**
	 * @param args
	 */
	public double  compoundInterest() {
		double principal, rate ,time, c_int, amount;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a Principal amount : ");
     	principal = sc.nextDouble();
     	System.out.println("Enter an Interest rate : ");
     	rate = sc.nextDouble();
     	System.out.println("Enter a Time period in years : ");       
        time = sc.nextDouble();
        amount = principal * (Math.pow((1+ rate/100), time)) ; 
		c_int= amount-principal;
		System.out.println("Compound Interest :"+c_int);
		System.out.println("Amount :"+amount);
		sc.close();
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompoundInterest ci =new CompoundInterest();
     	//Scanner sc = new Scanner(System.in);
     	
			ci.compoundInterest();
	
	}

}
