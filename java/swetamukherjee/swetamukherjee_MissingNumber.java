import java.util.*;
/*
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

https://cses.fi/problemset/task/1083
*/
public class MissingNo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = n*(n+1)/2;
		long total = 0l;
		for(long i = 0l;i<n-1;i++)
		{
			total += sc.nextLong();
		}
		System.out.print(sum - total);


	}
}
/*author:swetamukherjee
https://cses.fi/user/32972
*/