/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
Input
The only input line contains a string of n characters.
Output
Print one integer: the length of the longest repetition.

link: https://cses.fi/problemset/task/1069/
author: Lipsa Mishra
profile: https://cses.fi/user/32829
 */
import java.util.Scanner;
public class lipsamishra1609_repetitions {
	
    public static void main (String[] args) {
    	// TODO Auto-generated method stub
    	Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        int n = str.length();
        int count=1;
        int max=1;
		for(int i=1;i<n;i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
				count+=1;
			else
				count=1;
			
			if(count>max)
				max=count;
		}
		System.out.println(max);
    }
}
