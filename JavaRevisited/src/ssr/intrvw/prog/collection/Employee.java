package ssr.intrvw.prog.collection;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	int empID;
	String empName;

	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		int i;
		i = -(o1.empID - o2.empID);
		if (i == 0) {
			i = -(o1.empName.compareTo(o2.empName));
		}
		return i;
	}

}
