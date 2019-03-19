package ssr.intrvw.prog.strings;

public class PassByVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str1 = new StringBuilder();
		str1.append("A");
		StringBuilder str2 = new StringBuilder();
		str2.append("B");
		
		fun(str1,str2);
		
		System.out.println(str1.append(str2));

	}
	
	public static void fun (StringBuilder str1, StringBuilder str2){
		
		StringBuilder temp = new StringBuilder();
		temp.append("C");
		str1.append("D");
		System.out.println(str1);
		str2 = temp;
		System.out.println(str2);
		str1 = str2;
		System.out.println(str1);
	}

}
