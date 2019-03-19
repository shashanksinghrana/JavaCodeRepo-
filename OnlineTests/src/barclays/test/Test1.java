package barclays.test;

import java.util.Arrays;

public class Test1 {

	public static int solution(int[] A) {
		Arrays.sort(A);
		int start = 0;
		int end = A.length - 1;
		int result = Math.abs(A[0] * 2);
		while (start < end) {
			int cur = Math.min(Math.abs(A[start] + A[end]), Math.min(Math.abs(A[start] * 2), Math.abs(A[end] * 2)));
			if (cur == 0) {
				return 0;
			}

			result = Math.min(result, cur);

			if (A[start] >= 0 || A[end] <= 0) {
				break;
			}
			if (start + 1 < end) {
				if (Math.abs(A[start + 1] + A[end]) < Math.abs(A[start] + A[end - 1])) {
					start++;
				} else {
					end--;
				}

			} else {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr [] ={0,3,3,7,5,3,11,1};
		System.out.println(solution(arr));

	}

}
