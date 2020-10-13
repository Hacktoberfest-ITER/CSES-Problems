/*You are given a DNA sequence: a string consisting of characters A, C, G, and T.
 * Your task is to find the longest repetition in the sequence. This is a maximum-
 * length substring containing only one type of character.

https://cses.fi/problemset/task/1069
 */
import java.util.*;
public class Utkarsh_Shankar_Repetitions {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int c=1,k=1;
		char ch1,ch2;
		if(s.length()>1)
		{for(int i=0;i<(s.length()-1);i++)
		{
			ch1=s.charAt(i);
			ch2=s.charAt(i+1);
			if(ch1==ch2)
			{	c++;
			k=Math.max(c, k);
			}
			else
				c=1;
			
		}
		System.out.println(k);
		}
		else
			System.out.println("1");
	}
}
//author : Utkarsh Shankar
//profile: https://cses.fi/user/32339

		

