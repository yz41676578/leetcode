package CrackingCode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class q13 {
	static boolean isPermutation_no_dup(String a, String b)
	{
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<a.length(); i++)
			set.add(a.charAt(i));
		for(int i=0; i<b.length(); i++)
			if(!set.contains(b.charAt(i)))
				return false;
		return true;
	}
	
	static boolean isPermutation_dup(String a, String b)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<a.length(); i++)
		{
			char key = a.charAt(i);
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		for(int i=0; i<b.length(); i++)
		{
			char key = b.charAt(i);
			if(map.containsKey(key)&&map.get(key)>0)
				map.put(key, map.get(key)-1);
			else
				return false;
		}
		for(char c:map.keySet())
			if(map.get(c)>0)
				return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println("enter string:");
		Scanner scanner = new Scanner(System.in);
		System.out.println(isPermutation_dup(scanner.next(), scanner.next()));
		scanner.close();
	}
}
