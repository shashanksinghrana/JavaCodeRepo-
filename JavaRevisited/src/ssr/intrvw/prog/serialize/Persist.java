package ssr.intrvw.prog.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("Emp_Externalize.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
//		User_Serialize user1 = new User_Serialize();
//		user1.setAge(18);
//		user1.setUserName("Anil");
//		out.writeObject(user1);
		
		Employee_Exter emp1 = new Employee_Exter();
		emp1.setEmpName("Shrikhala Rana");
		emp1.setSalary(450000);
		out.writeObject(emp1);
		emp1.writeExternal(out);
		
		
		
		
		out.close();
		fout.close();
		

	}

}
