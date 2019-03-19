package ssr.intrvw.prog.general;

public class AutoBoxingTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int i = 10;
		Integer j = new Integer(10);
		Float f = new Float(10);
		System.out.println(f instanceof Float);
		/*for(int i = 0; i< arr.length; i++){
			System.out.println(arr[i] instanceof Integer.class);
		}*/

	}

}
