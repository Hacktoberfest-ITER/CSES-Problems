//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
//https://cses.fi/problemset/task/1083

import java.util.*;
public class MissingNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       long n=sc.nextInt();
       long e=0,i,res,a=0;
         for ( i = 1; i < n; i++)
         {
             e=sc.nextInt();
             a=a+e;
         }
         res=(n * (n + 1) / 2) - a;
         System.out.println(res);
         
    }
}

//Author:SumanMore/
// User id: https://cses.fi/user/32360
//Solution: https://cses.fi/problemset/result/1072331/
