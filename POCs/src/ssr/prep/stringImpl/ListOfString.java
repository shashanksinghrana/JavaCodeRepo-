package ssr.prep.stringImpl;

import java.util.*;

public class ListOfString {
	
	static List<String> strList = new ArrayList<String>();
	
	public static boolean  isUpperCaseString(String str){
		String strUpper = str.toUpperCase();
		if(str.equals(strUpper)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		strList.add("AAAAAAAA");
		strList.add("AAAAeAwA");
		strList.add("dshsdfhsdhFDAF");
		strList.add("AAAAFFF");
		strList.add("AAAAAAAe");
		
		
		Iterator<String> itr = strList.iterator();
		
		while(itr.hasNext()){
			if(isUpperCaseString(itr.next())){
				itr.remove();
			}
		}
		System.out.println(strList);
		
	}
}


