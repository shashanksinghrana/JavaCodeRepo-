package ssr.intrvw.prog.strings;

import java.util.Scanner;

public class CheckInput {
	
	
	static boolean numberOrNot(String input){
		try{
			Integer.parseInt(input);
		}
		catch(NumberFormatException ne){
			
			return false;
		}
		
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		numberOrNot(input);
	}
	
}
