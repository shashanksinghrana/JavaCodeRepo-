package ssr.intrvw.prog.general;

import java.util.Scanner;

public class ContinuousInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		 String yesOrNo = new String("Y");

		  while(yesOrNo.equalsIgnoreCase("Y")) 
		  {
		    //Insert your population calculating code and printing out stuff here

		   //Then ask if they want to run the simulation again and have the input become yesOrNo
		   System.out.println("Would you like to run this simulation again? [y/n]");
		   yesOrNo = in.nextLine();
		 } //End While
		  in.close();
	}

}
