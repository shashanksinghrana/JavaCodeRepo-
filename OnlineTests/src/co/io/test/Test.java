package co.io.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Test p = new Test();
		p.test();
	}

	private void test() {
		// TODO Auto-generated method stub
		try{
			int p= 100;
			int days=0;
			int emi =p/days;
			Vector v = new Vector<>();
			
		}
		catch (ArithmeticException e){
			System.out.println("A");
			throw new NullPointerException();
		}catch(NullPointerException e){
			System.out.println("B");
			throw new IllegalArgumentException();
		}catch (Exception e){
			System.out.println("C");
		}finally{
			System.out.println("D");
		}
		System.out.println("E");
		}
	}

