package ssr.intrvw.prog.amazon;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAdd {
	
	public static List<Integer> addList(List<Integer> l1, List<Integer> l2){
		
		int l1Size = l1.size();
		int l2Size = l2.size();
		int diff = 0;
		int resultElement = 0;
		int carry = 0;
		
//		List<Integer> resultList = new LinkedList<Integer>();
//		for(int temp=0;temp<l1.size();temp++){
//			resultList.add(0);
//		}
		
		if(l1Size>=l2Size){
			diff = l1Size - l2Size;
			for(int i = l1Size-1;i>=0;i--){
				
				if((i-diff)>=0){
				resultElement = l1.get(i)+l2.get(i-diff)+carry;
				if (resultElement>=10){
					carry = resultElement/10;
					resultElement = resultElement%10;
					
				}
				
				}else{
					resultElement = l1.get(i)+carry;
					if (resultElement>=10){
						carry = resultElement/10;
						resultElement = resultElement%10;
						
					}else
						carry = 0;
				}
				l1.remove(i);
				l1.add(i,resultElement);
				
			}
		}
		
		return l1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		List<Integer> result;
		l1.add(1);
		l1.add(0);
		l1.add(0);
		l1.add(1);
		//l1.add(9);
//		l2.add(9);
//		l2.add(9);
		l2.add(9);
		l2.add(9);
		//l2.add(1);
		System.out.println(l1);
		System.out.println(l2);
		result = addList(l1, l2);
		
		System.out.println(result);
		

	}

}
