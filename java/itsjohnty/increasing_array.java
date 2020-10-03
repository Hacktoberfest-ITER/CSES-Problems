//Increasing Array
//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
//Question: https://cses.fi/problemset/task/1094/
//Solution: https://cses.fi/problemset/result/1067053/

import java.util.*;

public class IncreasingArray
{
    public static void main(String args[])
    {   
        long minTurns=0;
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int a[]= new int[n];
        a[0]= in.nextInt();
        for(int i=1;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i-1]>a[i])
            {
                minTurns+=(a[i-1]-a[i]);
                a[i]= a[i-1];
            }
        }
        System.out.println(minTurns);
    }
}

//author: itsjohnty