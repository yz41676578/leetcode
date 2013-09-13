package CrackingCode;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class q11 {
	
	static boolean isAllUnique( String s )
	{
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i<s.length(); i++)
		{
			if( set.contains(s.charAt(i)) )
				return false;
			else
				set.add(s.charAt(i));
		}
		return true;
	}
	
	public static void main( String[] args )
	{
		while(true)
		{
			System.out.println("enter string:");
			Scanner scanner = new Scanner(System.in);
			System.out.println(isAllUnique(scanner.next()));
			scanner.close();
		}
		
	}
	
}
