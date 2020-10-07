/*You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.*/
/*Example
Input:
ATTCGGGA
Output:
3
link: https://cses.fi/problemset/task/1069
*/
import java.util.Scanner;
public class repetition{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine().toLowerCase();
	int a=s.length(),b=1,c=1;
	for (int i=1;i<a;i++)
	{
		if(s.charAt(i)== s.charAt(i-1))
		{
			c++;
			b=Math.max(b,c);
		}
		else
			c=1;
	}
	System.out.print(b);
	}
}
//Author: itsjohnty