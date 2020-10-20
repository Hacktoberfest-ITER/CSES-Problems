/*
	
You are given an array of n integers. 
You want to modify the array so that it is increasing,
 i.e., every element is at least as large as the previous element.

On each turn, you may increase the value of any element by one. 
What is the minimum number of turns required?


https://cses.fi/problemset/task/1094

*/

import java.util.*;

public class IncreasingArray
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextLong();
		}
		long total = 0l;
		long m= arr[0];
		for (int i = 1; i < n; i++)
    {
        total += Math.max(0L, m - arr[i]);
        m = Math.max(m, arr[i]);
    }
    System.out.println(total);

	}
}

/*
author:swetamukherjee
https://cses.fi/user/32972
*/

