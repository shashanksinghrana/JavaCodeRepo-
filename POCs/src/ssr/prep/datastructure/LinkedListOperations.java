package ssr.prep.datastructure;

public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedListImpl lList = new LinkedListImpl();
		lList.add(5);
		lList.add(6);
		lList.add(7);
		lList.add(8);
		lList.add(9);
		
		lList.print();
		System.out.println("\nList size: "+lList.size());
		lList.get(3);
	}

}
