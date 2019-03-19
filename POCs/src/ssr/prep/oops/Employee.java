package ssr.prep.oops;

public class Employee {
	int empid;
	int salary;
	String empname;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public Employee(int empid, int salary, String empname) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.empname = empname;
	}

}
