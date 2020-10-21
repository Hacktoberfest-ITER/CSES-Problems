
/*
 * Your task is to calculate the number of trailing zeros in the factorial n!.

For example, 20!=2432902008176640000 and it has 4 trailing zeros.

Input

The only input line has an integer n.

Output

Print the number of trailing zeros in n!.

Constraints
1≤n≤109
Example

Input:
20

Output:
4
author:Ashish Senapati
profile:https://cses.fi/user/32749
link-https://cses.fi/problemset/task/1618/
 */
import java.util.Scanner;
public class ash0202_TrailingZeros 
{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{		
		
		long n=sc.nextLong();
		int c=0;
		for(int i=5;(n/i!=0);i*=5)
		{
			c=c+(int)(n/i);
		}
		System.out.println(c);
		
		 
		 
		
	
	}
	
}
