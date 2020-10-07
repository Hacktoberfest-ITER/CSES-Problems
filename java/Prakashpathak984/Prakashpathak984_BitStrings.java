// Your task is to calculate the number of bit strings of length n. For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.
// Link : https://cses.fi/problemset/task/1617/

import java.util.Scanner;
public class Prakashpathak984_BitStrings
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		sc.close();
		long pow=1;
		long m=(long)Math.pow(10,9)+7;
		for(int i=0;i<n;i++)
		{
			pow*=2;
			pow%=m;
		}
		System.out.println(pow);
	}
}

// Author : Prakashpathak984
// CSES Profile Link : https://cses.fi/user/32961