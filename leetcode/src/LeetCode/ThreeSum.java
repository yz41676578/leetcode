package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public static ArrayList<int[]> FindTriplets(int[] arr, int n) {
		
		Arrays.sort(arr);
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1, k = n-1; j < k; ) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == 0) {
					int[] temp= new int[] {arr[i], arr[j], arr[k]};
					list.add(temp);
					j++;
					k--;
				}
				else if(sum < 0)
					j++;
				else
					k--;
			}
		}
		return list;
	}
}
