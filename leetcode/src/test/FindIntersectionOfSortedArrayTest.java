package test;

import LeetCode.FindingIntersectionOfTwoSortedArrays;


public class FindIntersectionOfSortedArrayTest {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		int[] b = new int[] {3,4,5,6,7};
		
		Integer[] arr = FindingIntersectionOfTwoSortedArrays.findIntersection(a, b);
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
		
	}
}
