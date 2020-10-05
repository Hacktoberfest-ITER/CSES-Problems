//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
//LINK:-https://cses.fi/problemset/task/1069
import java.util.*;
public class Shivangibose_Repititions
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		long max=0,newmax=0,c=1;
		if(s.length()==1)
		{
			System.out.println(c);
		}
		else
		{
		for(int x=0;x<=s.length()-2;x++)
		{
			if(s.charAt(x)==s.charAt(x+1))
			{
				c++;
				newmax=c;
				if(newmax>max)
				{
					max=newmax;
				}
				continue;
			}
			else
			{
				newmax=c;
				if(newmax>max)
				{
					max=newmax;
				}
				c=1;
				continue;
			}
		}
		System.out.println(max);
		}
	}
}

//AUTHOR:-Sh161101
//CSES PROFILE LINK:-https://cses.fi/user/32657