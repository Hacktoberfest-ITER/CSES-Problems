/* You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
Your task is to find the longest repetition in the sequence. 
This is a maximum-length substring containing only one type of character.

Link: https://cses.fi/problemset/task/1069/
*/



import java.util.*;
public class repetitionString {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String s="";
		int c=1,max=1;
		s=in.nextLine().toUpperCase();
		for(int i=1;i<s.length();i++)
		{
			if (s.charAt(i)==s.charAt(i-1))
				
			{
				c++;
				max=Math.max(max, c);
				
			}
			else
				c=1;
		}
				System.out.println(max);
		}

}

//Author: Palak Srivastava
//https://cses.fi/user/32824
