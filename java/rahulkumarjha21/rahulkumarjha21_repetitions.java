// You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
// https://cses.fi/problemset/task/1069
import java.io.*;
public class Repetitions 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s=in.readLine();
		int c=1,max=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
				c=c+1;
			else
				c=1;
			if(c>max)
				max=c;
		}
		System.out.println(max);
	}	
}
// author: rahulkumarjha21
// profile: https://cses.fi/user/32483