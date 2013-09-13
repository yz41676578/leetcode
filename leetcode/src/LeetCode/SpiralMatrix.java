package LeetCode;

public class SpiralMatrix {
	static void Spiral(Integer k, int m, int n, int[][] matrix) {
		if(m-2*k <=0 || n-2*k <=0) {
			return;
		}
		else {
			Print(k, m, n, matrix);
			Spiral(k+1, m, n, matrix);
		}
	}
	
	static void Print(Integer k, int m, int n, int[][] matrix) {
		
		/*
		 *  Why?
		 */
		if(m-2*k == 1) {
			for(int i = k ; i <= n-1-k; ++i)
				System.out.println(matrix[i][k]);
		}
		else if(n-2*k == 1) {
			for(int i = k ; i <= m-1-k; ++i)
				System.out.println(matrix[k][i]);
		}
		
		else {
			// from top-left to top-right
			for(int i = k; i<=m-k-1; ++i) {
				System.out.println(matrix[k][i]);
			}
			// from top-right to bot-right
			for(int i = k+1; i <= n-k-1; ++i) {
				System.out.println(matrix[i][m-k-1]);
			}
			// from bot-right to bot-left
			for(int i = k+1; i <= m-k-1; ++i) {
				System.out.println(matrix[n-k-1][m-i-1]);
			}
			// from bot-left to top-left
			for(int i = k+1; i <= n-k-2; ++i) {
				System.out.println(matrix[n-i-1][k]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4,5,0}, {14, 15, 16, 17, 6,0}, {13, 20, 19, 18, 7,0}, {12, 11, 10, 9, 8,0}, {-1,-2,-3,-4,-5,-6}};
		
		Spiral(0,6, 5, matrix);
	}
	
}
