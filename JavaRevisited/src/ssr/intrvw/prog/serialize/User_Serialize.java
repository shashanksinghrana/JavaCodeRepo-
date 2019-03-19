package ssr.intrvw.prog.serialize;

import java.io.Serializable;

public class User_Serialize implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3333868647988240582L;
	/**
	 * 
	 */
	
	
	private String userName;
	private int age;

	public User_Serialize() {
		super();
	}

	public User_Serialize(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void serialize(){
		
	}
	

}
