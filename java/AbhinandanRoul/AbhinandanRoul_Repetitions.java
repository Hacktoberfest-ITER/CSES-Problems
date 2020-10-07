/*Problem Link: https://cses.fi/problemset/task/1069/
* Question: You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
* Input: The only input line contains a string of n characters.
* Output: Print one integer: the length of the longest repetition.

* Result: https://cses.fi/problemset/result/1077918/
* 
* Author- Abhinandan Roul
* UserID: https://cses.fi/user/32398
 */



import java.util.*;
public class Repetitions {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String s=in.next();
		char ch []=new char[s.length()];
		ch=s.toCharArray();
		int c=1,max=1,len=s.length();
		for(int i=1;i<len;i++)
		{
			if(ch[i]==ch[i-1])
			{
				c++;
				max=c>max?c:max;
			}
			else
				c=1;
		}
		System.out.println(max);	
	}
}
