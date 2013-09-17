package LeetCode;

public class RotateArray {
	public static void RotateArray(int[] array, int n, int k) {
		int[] temp = new int[k];
		for(int i = 0; i < k; i++) {
			temp[i] = array[n-k+i];
		}
		
		for(int i = n-1; i >= k ; i--) {
			array[i] = array[i-k];
		}
		
		for(int i = 0 ;i < k; i++) {
			array[i] = temp[i];
		}
	}
	
	
	
	public static void RotateArray_Pro(int[] array, int n, int k) {
		// 1. reverse the whole array
		reverse(array, 0, n-1);
		// 2. reverse 0~k-1
		reverse(array, 0, k-1);
		// 3. reverse k~n-1
		reverse(array, k, n-1);
	}
	
	private static void reverse(int[] array, int from, int end) {
		for(int i = from, j = end; i < j; i++, j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
