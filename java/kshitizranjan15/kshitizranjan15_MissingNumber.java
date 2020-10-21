import java.util.Scanner;
/*
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
//https://cses.fi/problemset/task/1083
*/
public class MissingNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n =sc.nextLong();
		long sum = n*(n+1)/2;
		long x=0L;
		for(int i=0;i<n-1;i++)
		{
			x=x + sc.nextInt();
		}
          long mn=sum-x;
          System.out.println(mn);
	}

}
//author:- kshitizranjan15 
// https://cses.fi/user/32865