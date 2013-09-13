package LeetCode;

public class PrintPrime {
    
	    static void print(int n) {
	        boolean[] prime = new boolean[n];
	        for(int i = 0; i < n; ++i)
	        	prime[i] = true;
	        prime[0] = false;
	        prime[1] = false;
	        int limit = (int)Math.sqrt(n);
	        for(int i = 2; i <= limit; ++i) {
	            if(prime[i]) {
	                for(int j = i*i; j < n; j = j+i) {
	                    prime[j] = false;
	                }
	            }
	        }        
	        for(int i = 0; i < n; ++i) {
	            if(prime[i]) {
	                System.out.print(i);
	                System.out.print(" ");
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	       print(100);
	        
	    }
}
