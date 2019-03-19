package ssr.intrvw.prog.datastructure;

public class SelectionSort {

	public void swap(int a, int b) {

		int temp;
		temp = a;
		a = b;
		b = temp;

	}

	public int[] sortSelectionSort(int[] arr) {
		int temp;
		int index;
		for (int i = 0; i < arr.length; i++) {
			index = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					index = j;
					temp = arr[i];
					arr[i] = arr[index];
					arr[index] = temp;
				}
			}
		}
		return arr;
	}

}
