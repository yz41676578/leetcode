package CrackingCode;
import java.util.Scanner;


public class q14 {
	static String replaceSpace(String s)
	{
		int begin = 0;
		int end = 0;
		int middle = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
				begin++;
			else 
				break;
		}
		for(int i=s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)==' ')
				end++;
			else 
				break;
		}
		for(int i=begin; i<s.length()-end; i++)
		{
			if(s.charAt(i)==' ')
				middle++;
		}
		
		int len = s.length()+2*middle;
		char[] arr = new char[len];
		for(int i=0; i<s.length(); i++)
			arr[i]=s.charAt(i);
		for(int i=s.length()-1, j=len-1; i>=0; i--)
		{
			if(arr[i]==' '&&i<s.length()-end&&i>=begin)
			{
				arr[j--]='0';
				arr[j--]='2';
				arr[j--]='%';
			}
			else
				arr[j--]=arr[i];
		}
		return new String(arr);
 	}
	
	public static void main(String[] args)
	{
		System.out.println("enter string:");
		Scanner scanner = new Scanner(System.in);
		System.out.println(replaceSpace(scanner.next()));
		scanner.close();
	}
}
