package test;

import LeetCode.RotateArray;

public class RotateArrayTest {
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5,6,7,8,9};
		RotateArray.RotateArray(array, 9, 3);
		for(int i: array) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		RotateArray.RotateArray_Pro(array, 9, 3);
		for(int i: array) {
			System.out.print(i + " ");
		}
		
	}
}
