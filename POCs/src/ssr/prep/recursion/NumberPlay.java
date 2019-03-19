package ssr.prep.recursion;

public class NumberPlay {

	public void addNumber(int n) {
		if (n == 0)
			return;
		if (n == 1)
			System.out.println(n);
		else
			System.out.print(n + "+");
		addNumber(n - 1);
	}

	public static void main(String[] args) {
		NumberPlay play = new NumberPlay();

		play.addNumber(105);

	}

}
