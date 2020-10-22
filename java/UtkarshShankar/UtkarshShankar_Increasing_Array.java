//You are given an array of n integers. You want to modify the array so that it is increasing, i.e.
//, every element is at least as large as the previous element.
//
//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
//https://cses.fi/problemset/task/1094/

import java.util.*;
public class UtkarshShankar_Increasing_Array
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		long c=0;
		int i=1;
		while(i<n)
		{
			if(a[i-1]<=a[i])
			{
				i++;
			}
			else
			{
				c=c+(a[i-1]-a[i]);
				a[i] = a[i-1];
				i++;
			}
		}
		System.out.println(c);
	}
}

//author : Utkarsh Shankar
//profile: https://cses.fi/user/32339