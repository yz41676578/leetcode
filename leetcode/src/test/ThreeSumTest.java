package test;

import java.util.ArrayList;

import LeetCode.ThreeSum;;

public class ThreeSumTest {
	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,-2,-1,8,-5,-9,1,2,15,-20,30,-7,-25,-3};
		ArrayList<int[]> list = ThreeSum.FindTriplets(arr, arr.length);
		
		for(int[] temp: list) {
			for(int i: temp) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
