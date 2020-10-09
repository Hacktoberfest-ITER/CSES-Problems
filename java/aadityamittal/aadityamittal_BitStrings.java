/*
Your task is to calculate the number of bit strings of length n.

For example, if n=3, the correct answer is 8, because the possible bit strings are 
000, 001, 010, 011, 100, 101, 110, and 111.

https://cses.fi/problemset/task/1617/

*/

import java.util.Scanner;
class BitStrings{
	public static void main(String[] args)
	{
		int mod = (int)Math.pow(10,9)+7;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 1;
		while(n-->0){
			p=(p*2)%mod;
		}
		System.out.println(p);

}}

/*
author:aadityamittal
https://cses.fi/user/32817
*/