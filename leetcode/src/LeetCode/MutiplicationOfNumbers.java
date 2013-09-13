package LeetCode;

public class MutiplicationOfNumbers {
	
	public static int[] mutiplyNumbers(int[] a, int n) {
		int[] res = new int[n];
		int m = 1;
		for(int i = 0; i < n; ++i) {
			res[i] = m;
			m *= a[i];
		}
		m = 1;
		for(int i = n-1; i >= 0; --i) {
			res[i] *= m;
			m *= a[i];
		}
		return res;
	}  
	
	public static int[] mutiplyNumbers_Pro(int[] a, int n) {
		int[] res = new int[n];
		int l = 1;
		int r = 1;
		for(int i = 0; i < n; ++i)
			res[i] = 1;
		for(int i = 0; i < n; ++i) {
			res[i] *= l;
			res[n-1-i] *= r;
			l *= a[i];
			r *= a[n-1-i];
		}
		return res;
	}  
	
}
