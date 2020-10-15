/*
Given an array of n integers, your task is to find the maximum sum of values in a contiguous, nonempty subarray.

Input:
8
-1 3 -2 5 3 -5 2 2

Output:
9

*/

//https://cses.fi/problemset/task/1643/


//author:amohapatra123
import java.util.*; 
  
public class amohapatra123_maximum_subarray_sum
{ 
    public static void main (String[] args) 
    { 
        Scanner y= new Scanner(System.in);
        int n=y.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=y.nextLong();
        } 
        long result=maxSubArraySum(arr) ;
        System.out.print(result);
    } 
  
    static long maxSubArraySum(long a[]) 
    { 
        int size = a.length; 
        long max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = max_ending_here + a[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 
    } 
} 