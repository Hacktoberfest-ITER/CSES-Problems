import java.util.Scanner;
/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
Your task is to find the longest repetition in the sequence. 
This is a maximum-length substring containing only one type of character.
//https://cses.fi/problemset/task/1069/
*/
public class Repetitions {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int x = s.length();
		long c = 1l,ans = 1l;
		for(int i = 1; i < x; i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				c++;
			}
			else{
				ans = Math.max(c,ans);
				c = 1l;
			}
		}ans = Math.max(c,ans);
		System.out.println(ans);
	}
}
//author:- kshitizranjan15 
// https://cses.fi/user/32865
