package ssr.intrvw.prog.designpattern.behavioral.iterator;

public class IteratorPatternDemo {
	
	public static void main (String args[]){
		BookContainer bookContainer = new BookContainer();
		IIterator itr = bookContainer.createIterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
