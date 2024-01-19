/**
 * 
 */
package org.ict.day3;

import java.util.Scanner;

/**
 * 
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string"); // Learn Share Enjoy
		String str = sc.nextLine();
		sc.close();
		String str2 = " Thanks";
		final String str3 ="Unchangable";
		System.out.println(str3);
//		str3="Changable";
		//System.out.println("You entered "+str);
		StringBuilder sb = new StringBuilder("Learn");
		
		System.out.println("The replaced string is "+str.replace('a', 'r'));
		System.out.println("Length of the string is "+str.length());
		System.out.println("Character at 3rd position is "+str.charAt(2));
		System.out.println("Substring from third last character is "+str.substring(str.length() - 3));
		System.out.println("Substring from 2nd to 5th character is "+str.substring(1, 4));
		System.out.println("Contact of two strings : "+str.concat(str2));
		System.out.println("Index of a word Share is "+str.indexOf("Share"));
		System.out.println("Are both Strings same ? "+str.equals(str2));
		System.out.println("Are Strings Hello and hello same ? "+"Hello".equals("hello"));
		System.out.println("Are Strings Hello and Hello same ? "+"Hello".equals("Hello"));
		System.out.println("Are Strings Hello and hello same with ignorecase? "+"Hello".equalsIgnoreCase("hello"));
		System.out.println("String in lowercase is  "+str.toLowerCase());
		System.out.println("String in uppercase is  "+str.toUpperCase());
		System.out.println("Trimmed space at start and end of ' Well Done ' : "+ " Well Done ".trim());
		System.out.println("String in reverse is  "+sb.reverse());




	}

}
