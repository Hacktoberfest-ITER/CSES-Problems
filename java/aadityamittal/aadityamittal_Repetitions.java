/*You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
Your task is to find the longest repetition in the sequence.
 This is a maximum-length substring containing only one type of character.

https://cses.fi/problemset/task/1069/
*/

import java.util.*;

public class Repetitions
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int n = x.length();
		long t = 1l,ans = 1l;
		for(int i = 1; i < n; i++)
		{
			if(x.charAt(i)==x.charAt(i-1))
			{
				t++;
			}
			else{
				ans = Math.max(t,ans);
				t = 1l;
			}
		}ans = Math.max(t,ans);
		System.out.println(ans);
	}
}




/*author:aadityamittal
https://cses.fi/user/32817
*/