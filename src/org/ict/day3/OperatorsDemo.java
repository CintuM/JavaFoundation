/**
 * 
 */
package org.ict.day3;

import java.util.Scanner;

/**
 * 
 */
public class OperatorsDemo {

	/**
	 * @param args
	 */
	int num1,num2;
	public int addNumbers(int n1,int n2) {
		return n1+n2;
	}
	
	public int difference(int n1,int n2) {
		return n1-n2;
	}
	
	public int multiply(int n1,int n2) {
		return n1*n2;
	}
	
	public int getQuotient(int n1,int n2) {
		return n1/n2;
	}
	
	public int getRemainder(int n1,int n2) {
		return n1%n2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		
		OperatorsDemo demo = new OperatorsDemo();
		System.out.println(demo.addNumbers(num1,num2));
		System.out.println(demo.difference(num1,num2));
		System.out.println(demo.multiply(num1,num2));
		System.out.println(demo.getQuotient(num1,num2));
		System.out.println(demo.getRemainder(num1,num2));


	}
	

}
