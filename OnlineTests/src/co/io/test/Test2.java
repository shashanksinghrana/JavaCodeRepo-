package co.io.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
 public static void main(String[] args) {
	 /*try{
		 int x = 5/0;
	 }catch(Exception e){
		 System.out.println(e);
	 }*/
//	 List<String> list = Arrays.asList("Burger","pizza","donut","Burger");
//	 Set<String> s1 = new HashSet<>(list);
//	 Set<String> s2 = new TreeSet<>(list);
//	 System.out.println(s1.equals(s2));
//	 
	 String message ="good morning";
	 message.concat(" Sir");
	 String msg =(message.length()>12)?"Message too long": "OK message;";
	 System.out.println(msg+"::"+message);
}
}
