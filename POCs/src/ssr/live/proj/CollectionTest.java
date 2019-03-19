package ssr.live.proj;

import java.util.*;
import com.google.gson.*;

public class CollectionTest {
	public static void convertJsonToJsonObject(){

	    ArrayList<String> mylist = new ArrayList<String> ();

	 mylist.add("abc");
	 mylist.add("cfd");
	 mylist.add("ert");
	 mylist.add("fg");
	 mylist.add("ujk");
	 mylist.add("wer");

	 mylist.add("dvb");
	 mylist.add("ert");
	 String json = new Gson().toJson(mylist);

	 System.out.println(json);
	 }
	public void hashSetTest(){
		Set<Person> pSet = new HashSet<Person>();
		Map<Integer,Person> pMap = new HashMap<Integer,Person>();
		Person p1 = new Person("Ram","Baner",21);
		Person p2 = new Person("Ram","Baner",21);
		Person p3 = new Person("Shyam","Baner",21);
		
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		
		pMap.put(1, p1);
		pMap.put(2, p2);
		pMap.put(3, p3);
		
		Iterator itr = pSet.iterator();
		while(itr.hasNext())
			System.out.println(((Person)itr.next()));
		itr = pMap.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	
	public static void main(String args[]){
		convertJsonToJsonObject();
		
	}

}
