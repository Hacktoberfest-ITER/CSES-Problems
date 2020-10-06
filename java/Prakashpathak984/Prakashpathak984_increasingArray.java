// You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element. On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
// Link : https://cses.fi/problemset/task/1094

import java.util.Scanner;
public class Prakashpathak984_increasingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		long count=0;
		int i=1;
		while(i<n)
		{
			if(a[i-1]<=a[i])
			{
				i++;
			}
			else
			{
				count=count+(a[i-1]-a[i]);
				a[i] = a[i-1];
				i++;
			}
		}
		System.out.println(count);
	}
}

// Author : Prakashpathak984
// CSES Profile Link : https://cses.fi/user/32961