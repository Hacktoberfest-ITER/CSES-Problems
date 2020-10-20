//You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
//https://cses.fi/problemset/task/1621


import java.util.*;
public class DistinctNumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i;
		n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int c=1;
		for(i=1;i<n;i++)
			{
				if(a[i-1]!=a[i])
				{
					c++;
				}
			}
		
			System.out.println(c);
			
		

	}

}

//Author: Palak Srivastava
//https://cses.fi/user/32824
