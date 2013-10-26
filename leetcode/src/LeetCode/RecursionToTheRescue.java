package LeetCode;

public class RecursionToTheRescue {
	
	/**
	 * Print a Long number in decimal using only putChar(print 1 char each call)
	 * @param n
	 */
	public static void putLong(Long n) {
		if(n/10 == 0) {
			putChar(n);
			return;
		}
		putLong(n/10);
		putChar(n%10);
	}

	private static void putChar(long l) {
		System.out.print(l);
	}
	
	
	/**
	 * Reverse a string recursively.
	 */
	public static void reverseString(String str) {
		if(str.length() == 0)
			return;
		if(str.length() > 1)
			reverseString(str.substring(1));
		System.out.print(str.charAt(0));
	}
}
