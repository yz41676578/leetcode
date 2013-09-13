package LeetCode;
/**
 * 
 * Given a string of lowercase characters, 
 * reorder them such that the same characters are at least distance d from each other.
 * 
 * Input: { a, b, b }, distance = 2
 * Output: { b, a, b }
 *
 */
public class StringReorderDistanceApart {
	
	static final int charBase = 97;
	static final int charSize = 26;
	
	static public int getCharWithMaxFreq(int[] freq, boolean[] except) {
		int max = 0;
		int maxC = -1;
		for(int i = 0; i < charSize; i++) {
			if(!except[i] && freq[i] > max) {
				max = freq[i];
				maxC = i;
			}
		}
		
		return maxC;
	}
	
	static public void create(char[] str, int d, char[] res) throws Exception {
		int[] freq = new int[charSize];
		int[] used = new int[charSize];
		
		/*
		 *  find freq of each char
		 */
		for(int i = 0; i < str.length; ++i) {
			freq[str[i]-charBase]++;
		}

		for(int i = 0; i < str.length; ++i) {
			boolean[] except = new boolean[charSize];
			boolean done = false;
			while(!done) {
				int maxC = getCharWithMaxFreq(freq, except);
				if(maxC < 0)
					throw new Exception("error!");
				except[maxC] = true;
				if(used[maxC] <= 0) {
					used[maxC] = d;
					freq[maxC]--;
					res[i] = (char)(maxC + charBase);
					done = true;
				}
			}
			for(int j = 0; j < charSize; ++j)
				used[j]--;
		}
	}
	
	public static void main(String[] args) throws Exception {
		String s = "bbaaaccdd";
		char[] str = s.toCharArray();
		int d = 2;
		char[] res = new char[charSize];
		create(str, d, res);
		
		System.out.println(String.valueOf(res));
	}
	
}
