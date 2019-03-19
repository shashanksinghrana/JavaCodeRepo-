package ssr.prep.recursion;

public class Fibonacci {

	public void printFibonacci(int size) {
		int arr[] = new int[size];
		arr[0] = 0;
		arr[1] = 1;
		printFibonacciWithReccur(arr, 2, size);
	}

	private void printFibonacciWithReccur(int[] arr, int index, int size) {
		if (index == size) {
			prinFibonacciSeries(arr);
			return;
		}
		arr[index] = arr[index - 1] + arr[index - 2];
		printFibonacciWithReccur(arr, index + 1, size);
	}

	private void prinFibonacciSeries(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void printFibonacciWithLoop(int size) {
		System.out.print("0 1 ");
		int n = 0;
		int m = 1;
		for (int i = 0; i < size - 2; i++) {
			System.out.print(n + m + " ");
			m = n + m;
			n = m - n;
		}
	}

	public static void main(String[] args) {
		Fibonacci fibbi = new Fibonacci();
		fibbi.printFibonacciWithLoop(15);
		System.out.println();
		fibbi.printFibonacci(15);

	}

}
