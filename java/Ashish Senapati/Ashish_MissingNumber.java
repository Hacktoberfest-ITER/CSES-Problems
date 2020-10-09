
/*
 * You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

Input

The first input line contains an integer n.

The second line contains n−1 numbers. Each number is distinct and between 1 and n (inclusive).

Output

Print the missing number.

Constraints
2≤n≤2⋅105
Example

Input:
5
2 3 1 5

Output:
4

link:https://cses.fi/problemset/task/1083
author:Ashish Senapati
profile:https://cses.fi/user/32749
 */
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ashish_MissingNumber 
{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String num=sc.nextLine();
		String line=sc.nextLine();
		BigInteger sum=new BigInteger("0");
		StringTokenizer st=new StringTokenizer(line);
		while(st.hasMoreElements())
		{
			//sum+=Integer.parseInt(st.nextToken());
			sum=sum.add(new BigInteger(st.nextToken()));
		}
		
		  BigInteger one= new BigInteger("1"); 
		  BigInteger two = new BigInteger("2");
		  BigInteger b = new BigInteger(num);
		  BigInteger res =(b.multiply(b.add(one))).divide(two);
		  
		  System.out.println(res.subtract(sum));
		
	}

}
