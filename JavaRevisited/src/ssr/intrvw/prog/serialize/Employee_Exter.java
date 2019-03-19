package ssr.intrvw.prog.serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee_Exter implements Externalizable {
	private String empName;
	private int salary;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee_Exter(){}
	
	public Employee_Exter(String userName,int age){
		this.empName= userName;
		this.salary=age;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
		empName=(String) in.readObject();
		salary=in.readInt();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(empName);
		out.writeInt(salary);
	}
	
}
