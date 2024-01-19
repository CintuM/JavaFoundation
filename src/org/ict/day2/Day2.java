/**
 * 
 */
package org.ict.day2;

/**
 * 
 */
public class Day2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "String1";
		s="StringDup";
		System.out.println(s);
		
		String s1;
		s1 = "String2";
		s1 = "String3";
		System.out.println(s1);
		
//		swapNumber(2,3);
//		System.out.print("\r");
//		simpleInterest(1000,0.10,2);
//		System.out.print("\r");
//		perimeterOfRectangle(20,10);
//		System.out.print("\r");

		
	}
	
	public static void swapNumber(int x, int y) {
		int a = x;
		int b = y;
		int temp;
		System.out.println("value before swap : a= "+a+" ,b= "+b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("value after swap : a= "+a+" ,b= "+b);
		}
	public static void simpleInterest(int p,double r,int t) {
		double amount = p*r*t;
		System.out.println("Simple Interest = "+amount);
	}
	public static void perimeterOfRectangle(int l,int w) {
		int perimeter = (l+w)*2;
		System.out.println("Perimeter of rectangle = "+perimeter);
	}
}
