package test;
import LeetCode.MutiplicationOfNumbers;

public class MutiplicationOfNumbersTest {
	public static void main(String[] args) {
		int[] a = {4, 3, 2, 1, 2};
		int[] res = MutiplicationOfNumbers.mutiplyNumbers(a,5);
		for(int i: res) {
			System.out.print(i + " ");
		}
		System.out.println("");
		int[] res_pro = MutiplicationOfNumbers.mutiplyNumbers_Pro(a,5);
		for(int i: res_pro) {
			System.out.print(i + " ");
		}
	}
}
