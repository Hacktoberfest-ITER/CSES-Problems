// You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
// Link : https://cses.fi/problemset/task/1069

import java.util.Scanner;
public class Prakashpathak984_Repetitions
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int max=1,count=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
				if(max <= count)
					max = count;
			}
			else
			{
				count=1;
			}
		}
		System.out.println(max);
	}
}

// Author : Prakashpathak984
// CSES Profile Link : https://cses.fi/user/32961