package LeetCode;

public class SearchInRotatedSortedArray {
	static public int binarySearchInRotatedSortedArray(int[] arr, int n, int k) {
		for(int i = 0, j = n-1, m = (i + j)/2; i <= j; m = (i + j)/2) {
			if(arr[m] == k)
				return m;
			// left half is sorted
			if(i <= m) {
				if(k >= arr[i] && k < arr[m])
					j = m - 1;
				else
					i = m + 1;
			}
		
			// right half is sorted
			else if( m <= j) {
				if(k > arr[m] && k <= arr[j])
					i = m + 1;
				else
					j = m - 1;
			}
		}
		return -1;
	}
}
