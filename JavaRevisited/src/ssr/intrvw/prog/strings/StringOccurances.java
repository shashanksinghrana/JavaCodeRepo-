package ssr.intrvw.prog.strings;

import java.util.*;

public class StringOccurances {
	
	public Map countString(String str){
		
		Map<String,Integer> strMap = new HashMap<String, Integer>();
		 String[] strArray = str.split(" ");
		 
		 for (int i =0; i<strArray.length; i++){
			 
			 if(!strMap.containsKey(strArray[i])){
				 
				 strMap.put(strArray[i],1);
			 }
			 else{
				 strMap.put(strArray[i],strMap.get(strArray[i])+1);
				 
			 }
			 
		 }
		
		return strMap;
		
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		StringOccurances strOcc = new StringOccurances();
		String str = "This question Sometimes asked as a follow-up of last Hibernate Interview question, QueryCache actually stores the result of SQL query for future calls. Query cache can be used along with second level cache for improved performance. Hibernate support various open source caching solution to implement Query cache e.g. EhCache.";
		HashMap<String,Integer> m ;
		m = (HashMap<String, Integer>) strOcc.countString(str);
		
		Iterator itr = m.entrySet().iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
			

	}

}
