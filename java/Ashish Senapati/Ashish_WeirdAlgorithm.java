
/*
Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3â†’10â†’5â†’16â†’8â†’4â†’2â†’1

Your task is to simulate the execution of the algorithm for a given value of n.

Input

The only input line contains an integer n.

Output

Print a line that contains all values of n during the algorithm.

Constraints
1≤n≤106 
Example

Input:
3

Output:
3 10 5 16 8 4 2 1
link:https://cses.fi/problemset/task/1068
author:Ashish Senapati
profile:https://cses.fi/user/32749
*/

import java.math.BigInteger;
import java.util.Scanner;
public class Ashish_WeirdAlgorithm {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		String s=sc.nextLine();
		BigInteger b=new BigInteger(s);
		BigInteger zero=new BigInteger("0");
		BigInteger one=new BigInteger("1");
		BigInteger two=new BigInteger("2");
		BigInteger three=new BigInteger("3");		
		while((b.compareTo(one)==1))
		{
			System.out.print(b+"\t");
			b=b.mod(two).compareTo(zero)==0?b.divide(two):((b.multiply(three)).add(one));
		}
		System.out.print(1);
	}

}
