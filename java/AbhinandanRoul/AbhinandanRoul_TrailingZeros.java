/*
*Author- Abhinandan Roul
*Problem Link- https://cses.fi/problemset/task/1618/
*User ID- https://cses.fi/user/32398
*Result- https://cses.fi/problemset/result/1068563/
*/

import java.util.Scanner; 

class Main 
{ 
	
	static int find(int n) 
	{
		int c= 0; 
		for (int i=5;n/i>=1;i*=5) 
			c =c+n/i; 

		return c; 
	} 
	
	
	public static void main (String[] args) 
	{ 
		Scanner in=new Scanner (System.in);
		int n = in.nextInt();
		System.out.println(find(n)); 
	} 
} 