package ssr.intrvw.prog.datastructure;

public class BinarySearch {

	public static int binarySearch(int[] arr, int item){
		
		int start = 0;
		int end = arr.length - 1;
		int mid;
		while (start<end){
			mid = (start+end)/2;
			if(item == arr[mid]){
				return mid;
			}if(item == arr[start])
				return start;
			if(item == arr[end])
				return end;
			else if(item<arr[mid])
				end = mid-1;
			else if(item>arr[mid])
				start = mid+1;			
		}
		return -1;
	}
	 public static int binarySearch2(int[] inputArr, int key) {
         
	        int start = 0;
	        int end = inputArr.length - 1;
	        int mid;
	        while (start <= end) {
	            mid = (start + end) / 2;
	            if (key == inputArr[mid]) {
	                return mid;
	            }
	            if (key < inputArr[mid]) {
	                end = mid;
	            } else {
	                start = mid;
	            }
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		
		int[]arr = {24,15,0,45,26,29};
		int index = binarySearch2(arr, 29);
		
		System.out.println(index);
	}

}
