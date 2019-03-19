package co.io.test;

public class WiproTest {
	static int c=0;

	public static void main(String[] args) {
		while(true){
			try{
				c++;
				return;
			}
			finally{
				c++;
				break;
			}
		}
		System.out.println(c);

	}

}
