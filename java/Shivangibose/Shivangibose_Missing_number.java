//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
//LINK:-https://cses.fi/problemset/task/1083

import java.util.*;
public class Shivangibose_Missing_number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long a,s=0;
		s=(n)*(n+1)/2;
		for(int x=1;x<n;x++)
		{
			a=sc.nextInt();
                         s=s-a;
			
		}
		System.out.println(s);
	}
}

//AUTHOR:-Sh161101
//PROFILE LINK:-https://cses.fi/user/32657