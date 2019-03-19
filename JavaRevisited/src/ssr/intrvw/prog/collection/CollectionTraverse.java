package ssr.intrvw.prog.collection;

import java.util.*;


public class CollectionTraverse {

	public static void main(String[] args) {
		Hashtable<String,String> hmap = new Hashtable<String,String>();
		//hmap = new Hashtable<String,String>();
		
		hmap.put("1", "Ram");
		hmap.put("2", "Ram");
		hmap.put("3", "Ram");
		//hmap.put("4", null);
		hmap.put("5", "Ram");
		//hmap.put(null,"Ram");
		Enumeration<String> eMap = hmap.keys();
		//System.out.println(hmap.get(null));
		Set sMap = hmap.entrySet();		
		Iterator itr = sMap.iterator();
		
		while(itr.hasNext()){
			Map.Entry mEntry= (Map.Entry) itr.next();
			
			System.out.println(mEntry.getKey() + " " + mEntry.getValue());
		}
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		//ArrayList<Integer> bList = new ArrayList<Integer>();
		aList.add(12);
		aList.add(2);
		aList.add(35);
		aList.add(14);
		aList.add(15);
	
		System.out.println("Pre "+aList);
		for(int i=0;i<2;i++){
			
			aList.remove(1);
		}
		System.out.println("Post "+aList);
		Collections.sort(aList);
		
		itr = aList.iterator();
		
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
//		bList = (ArrayList)aList.clone();
//		bList.add(2);
//		bList.remove(2);
		
		//System.out.println("are they same "+ aList.equals(bList));
		
//		itr = bList.iterator();
//		
//		while(itr.hasNext()){
//			//System.out.println(itr.next());
//		}
		
		

	}

}


