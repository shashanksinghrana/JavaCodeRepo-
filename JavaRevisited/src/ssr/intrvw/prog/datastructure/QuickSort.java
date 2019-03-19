package ssr.intrvw.prog.datastructure;

public class QuickSort {
	
	static int arr[]={12,5,3,0,1,5,23,16,0};
	
	public static void quickSort(int lowerIndex, int higherIndex) {
		int temp;
		int i = lowerIndex;
		int j = higherIndex-1;
		int pivot = arr[((i + (j - i))) / 2];
		
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (pivot < arr[j]) {
				j--;
			}
			if (i <= j) {
				temp = arr[i];
				arr[j] = arr[i];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}
		
		
	}

	public static void main(String args[]) {
		
		//
		for (int i:arr)
		System.out.print(i+" ");
		
		quickSort(0, arr.length);
		System.out.println();
		
		for (int i:arr)
			System.out.print(i+" ");
		

	}

}
