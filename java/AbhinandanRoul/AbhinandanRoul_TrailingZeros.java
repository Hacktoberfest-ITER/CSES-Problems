/*
*Author- Abhinandan Roul
*Problem Link- https://cses.fi/problemset/task/1618/
*User ID- https://cses.fi/user/32398
*Result- https://cses.fi/problemset/result/1068563/

*Question-There are n apples with known weights. Your task is to divide the apples into two groups so that the difference between the weights of the groups is minimal.

*Input-
*The first input line has an integer n: the number of apples.
*The next line has n integers p1,p2,…,pn: the weight of each apple.

Output-
Print one integer: the minimum difference between the weights of the groups.
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