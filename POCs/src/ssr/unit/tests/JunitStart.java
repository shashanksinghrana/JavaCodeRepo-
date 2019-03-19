package ssr.unit.tests;

public class JunitStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int addPositiveNumbers (int a, int b){
		int result = 0;
		 if(b<0){
			b = -(b);
		}
		if(a<0){
			a = -(a);
		}
		result = a+b;
		return result;
	}

}
