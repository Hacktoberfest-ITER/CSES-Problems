/*
 * Problem Link: https://cses.fi/problemset/task/1083/
 * User ID: https://cses.fi/user/32398
 * Author: Abhinandan Roul
 * Question: You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
 * Input:  The first input line contains an integer n. The second line contains n−1 numbers. Each number is distinct and between 1 and n (inclusive).
 * Output: Print the missing number.
 */



import java.util.*;
public class MissingNumber
{
 public static int FindMissing(int a[], int n) 
    {
        int t = 1;
        for (int i=t+1;i <= (n + 1); i++)
        {
            t += i;
            t =t- a[i - 2];
        }
        return t;
    }
    public static void main(String[] args)
    {
    	Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int a[]=new int[n-1];
       for(int i=0;i<n-1;i++)
    	   a[i]=in.nextInt();   
        System.out.println(FindMissing(a, a.length));
    }
}