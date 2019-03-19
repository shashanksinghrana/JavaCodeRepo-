package ssr.intrvw.prog.strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = in.nextLine();
		in.close();
		
		char[] strChar = str.toCharArray();
		
		StringBuffer strb = new StringBuffer(str);
		
		int i = strb.length();
		
		StringBuffer strb1 = new StringBuffer(strb.substring(0, i/2+1));
		StringBuffer strb2 = new StringBuffer(strb.substring(i/2, i));
		
		strb2 = strb2.reverse();
		System.out.println(strb1 +" "+ strb2);
		
		if((strb1.toString()).equals(strb2.toString()))
			System.out.println(strb + " is a palindrome");
		else
			System.out.println(strb + " is not a palindrome");
		
		
		

	}

}
