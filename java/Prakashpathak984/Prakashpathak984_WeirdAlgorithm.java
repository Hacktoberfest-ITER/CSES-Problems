// Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one.
// Link : https://cses.fi/problemset/task/1068

import java.util.Scanner;
public class Prakashpathak984_WeirdAlgorithm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		sc.close();
		System.out.print(n+" ");
		while(n!=1)
		{
			if(n%2==0)
				n/=2;
			else
				n=(n*3)+1;
			System.out.print(n+" ");
		}
	}
}

// Author : Prakashpathak984
// CSES Profile Link : https://cses.fi/user/32961