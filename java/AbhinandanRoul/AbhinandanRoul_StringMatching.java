/* Author- Abhinandan Roul
 * User ID-https://cses.fi/user/32398
 * Problem Link-https://cses.fi/problemset/task/1753/
 * Result Link-https://cses.fi/problemset/result/1075566/
 *
 * Question- Given a string and a pattern, your task is to count the number of positions where the pattern occurs in the string.
 * Input- The first input line has a string of length n, and the second input line has a pattern of length m. Both of them consist of characters a–z.
 * Output- Print one integer: the number of occurrences.
 * Example Input-
 * saippuakauppias
 * pp
 * Output-
 * 2
 */

import java.util.Scanner;

public class StringMatchEfficient
{
	public static int KMPSearch(String pat, String input)
	{
		int m = pat.length();
		int n = input.length();
		int lps[] = new int[m];
		int j = 0; 
		FindLPS(pat,m,lps);
		int i = 0; 
		int res = 0;	
		while (i < n)
		{
			if (pat.charAt(j) == input.charAt(i))
			{
				j++;
				i++;
			}
			if (j == m)
			{
				j = lps[j-1];
				res++;
			}
			else if (i < n && pat.charAt(j) != input.charAt(i))
			{
				if (j != 0)
					j = lps[j-1];
				else
					i = i+1;
			}
		}
		return res;
	}

	public static void FindLPS(String pat, int m, int lps[])
	{
		int len = 0, i=1;
		lps[0] = 0; 
		while (i < m)
		{
			if (pat.charAt(i) == pat.charAt(len))
			{
				len++;
				lps[i] = len;
				i++;
			}
			else 
			{
				if (len != 0)
					len = lps[len-1];
				else 
				{
					lps[i] = len;
					i++;
				}
			}
		}
	}

	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		
		String input = in.next();
		String pat = in.next();
		int ans = KMPSearch(pat,input);
		System.out.println(ans);
	}
}

