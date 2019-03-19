package ssr.intrvw.prog.exception;

public class TryFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryFinallyTest t = new TryFinallyTest();
		
		int i = t.check();
		
		System.out.println(i);
		

	}
	
	int check(){
		
		try{
			System.out.println("Try block");
			//System.exit(0);
			return 1;
		}
		catch(Exception e){
			System.out.println("Catch Block");
			return 2;
		}
		finally{			
			System.out.println("Finally returning");
			System.exit(0);
			return 3;
		}
	}
}
