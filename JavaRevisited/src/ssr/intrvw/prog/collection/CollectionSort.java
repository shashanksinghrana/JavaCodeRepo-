package ssr.intrvw.prog.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ab");
		Employee e2 = new Employee(2, "bc");
		Employee e3 = new Employee(3, "cd");
		Employee e4 = new Employee(3, "de");

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(e3);
		empList.add(e1);
		empList.add(e2);
		empList.add(e4);
		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		Collections.sort(empList, new Employee());
		itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
