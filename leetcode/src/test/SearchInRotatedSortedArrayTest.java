package test;
import LeetCode.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,6,7,8,9,10,1,2};
		
		int p = SearchInRotatedSortedArray.binarySearchInRotatedSortedArray(arr, 10, 6);
		
		System.out.print("Position is: " + p);
	}
}
