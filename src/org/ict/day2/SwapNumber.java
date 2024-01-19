package org.ict.day2;

public class SwapNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwapNumber(15,10);
	}
	public SwapNumber(int x, int y) {
		int a = x;
		int b = y;
		int temp;
		System.out.println("value before swap : a= "+a+" ,b= "+b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("value after swap : a= "+a+" ,b= "+b);
		}
}
