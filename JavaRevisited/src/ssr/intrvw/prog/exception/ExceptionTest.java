package ssr.intrvw.prog.exception;

public class ExceptionTest {

	void check() throws RuntimeException{
		System.out.println("check");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("in main");
		
		ExceptionTest t = new ExceptionTest();
		t.check();

	}

}
