/*Question link: https://cses.fi/problemset/task/1068/
 * Result link: https://cses.fi/problemset/result/1078056/
 * 
 * Question: Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3→10→5→16→8→4→2→1. Your task is to simulate the execution of the algorithm for a given value of n.
* Input: The only input line contains an integer n.
* Output: Print a line that contains all values of n during the algorithm.

*Author: Abhinandan Roul
*UserID: https://cses.fi/user/32398
 */

import java.util.*;
public class WeirdAlgorithm {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		long n=in.nextInt();
		System.out.print(n+" ");
		while(n>1)
		{
		if(n%2==0)
		{
			n=n/2;
			System.out.print(n+" ");
		}
		else
		{
			n=n*3+1;
			System.out.print(n+" ");
		}
	}
	}

}
