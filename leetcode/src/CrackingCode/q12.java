package CrackingCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class q12 {
	static String reverse(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		for(int i = 0; i<sb.length()/2; i++)
		{
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(s.length()-i-1));
			sb.setCharAt(sb.length()-i-1, temp);
		}
		return sb.toString();
	}
	
	static String reverseByWord(String s)
	{
		StringBuffer sb = new StringBuffer(reverse(s));
		int last = 0;
		for(int i=0; i<=sb.length(); i++)
		{
			if(i==sb.length()||sb.charAt(i)==' ')
			{
				sb.replace(last, i, reverse(sb.substring(last, i)));
				last = i+1;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		String str = null;   
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr);   
		try   
		{   
			System.out.println("enter string£º");   
			str = br.readLine();   
			isr.close();
			br.close();
		}   
		catch(IOException e)   
		{   
			System.out.println("IO exception");   
		}   
		System.out.println(reverseByWord(str));
	}
}
