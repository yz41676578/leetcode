package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindingIntersectionOfTwoSortedArrays {
	static public Integer[] findIntersection(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int a = 0, b = 0; a < arr1.length && b < arr2.length; ) {
			if(arr1[a] == arr2[b]) {
				list.add(arr1[a]);
				a++;
				b++;
			}
			else if(arr1[a] > arr2[b]) {
				b++;
			}
			else {
				a++;
			}
		}
		return list.toArray(new Integer[0]);
	}
}
