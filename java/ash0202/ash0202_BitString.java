/*
profile-https://cses.fi/user/32749
link-https://cses.fi/problemset/task/1617/

Your task is to calculate the number of bit strings of length n.

For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.

Input

The only input line has an integer n.

Output

Print the result modulo 109+7.

Constraints
1≤n≤106
Example

Input:
3

Output:
8

*/
import java.math.BigInteger;
import java.util.Scanner;

public class Ashish_BitString {
static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int s = sc.nextInt();
		BigInteger two = new BigInteger("2");
		BigInteger  res = two.pow(s);
		System.out.println(res.mod(new BigInteger("1000000007")));
		
		
	}

}
