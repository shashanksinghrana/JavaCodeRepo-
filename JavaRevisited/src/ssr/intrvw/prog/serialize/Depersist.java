package ssr.intrvw.prog.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin = new FileInputStream("Emp_Externalize.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		User_Serialize user = null;
		Employee_Exter emp = null;
		
//		user = (User_Serialize)in.readObject();
//		
//		System.out.println(user.getAge()+" "+user.getUserName());
		
		emp = (Employee_Exter)in.readObject();
		System.out.println(emp.getEmpName()+" "+emp.getSalary());
		
		in.close();
		fin.close();

	}

}
