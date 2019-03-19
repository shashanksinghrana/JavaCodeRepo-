package ssr.intrvw.prog.general;

public class SwapWOTemp {
	
	public void swap(int a, int b){
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a +" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapWOTemp swt = new SwapWOTemp();
		
		swt.swap(5, 6);

	}

}
