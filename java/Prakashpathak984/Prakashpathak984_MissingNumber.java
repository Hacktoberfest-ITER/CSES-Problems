// You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
// Link : https://cses.fi/problemset/task/1083

import java.util.Scanner;
public class Prakashpathak984_MissingNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			int num=sc.nextInt();
			a[num-1]=1;
		}
		sc.close();
		for(int i=0;i<n;i++)
		{
			if(a[i]!=1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}
}

// Author : Prakashpathak984
// CSES Profile Link : https://cses.fi/user/32961