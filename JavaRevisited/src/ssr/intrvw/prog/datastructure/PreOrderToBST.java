package ssr.intrvw.prog.datastructure;

public class PreOrderToBST {

	public void preToBST(int arr[], int start, int end) {

		Node n = new Node(arr[start]);

		for (int i = start; i < end; i++) {

			if (arr[i] > arr[start]) {
				start = i;
				preToBST(arr, start, end);
			}else{
				end=i-1;
				start = start+1;
				preToBST(arr, start, end);
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 3, 6, 5, 7 };

	}

}
