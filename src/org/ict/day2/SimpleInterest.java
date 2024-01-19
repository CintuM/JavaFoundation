/**
 * 
 */
package org.ict.day2;

/**
 * 
 */
public class SimpleInterest {

	/**
	 * @param args
	 */
	
	public void simpleInterest(int p,double r,int t) {
		double amount = (p*r*t)/100;
		System.out.println("Simple Interest = "+amount);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest si = new SimpleInterest();
		si.simpleInterest(100000, 7.1, 1);

	}

}
