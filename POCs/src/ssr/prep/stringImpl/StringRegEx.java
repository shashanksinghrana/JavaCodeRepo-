package ssr.prep.stringImpl;

public class StringRegEx {

	public static void main(String[] args) {
		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&(*)+=])(?=\\S+$).{8,}";
		String word = "P()ssword03";
		
		if(word.matches(regex)){
			System.out.println("Its a Match");
		}else{
			System.out.println("Its not a Match");
		}

	}

}
