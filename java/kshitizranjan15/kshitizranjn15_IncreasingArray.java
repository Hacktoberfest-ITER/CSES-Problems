/*
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
//https://cses.fi/problemset/task/1094
*/
import java.util.Scanner;

public class IncreasingArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long[] array = new long[x];
		for(int i = 0; i < x; i++){
			array[i] = sc.nextLong();
		}
		long tot = 0l;
		long b= array[0];
		for (int i = 1; i < x; i++)
    {
        tot += Math.max(0L, b - array[i]);
        b = Math.max(b, array[i]);
    }
    System.out.println(tot);

		
	}
}
// author:- kshitizranjan15 
//https://cses.fi/user/32865