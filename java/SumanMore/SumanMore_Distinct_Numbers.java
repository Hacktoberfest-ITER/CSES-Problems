
//You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
//https://cses.fi/problemset/task/1621
   
 import java.util.*;
    public class distinctnumbers 
    {
	public static void main(String[] args)
       {
	        Scanner sc=new Scanner(System.in);
	        int n,i,j , cnt = 1;
                n=sc.nextInt();
	        int ar[]=new int[n];
	        for ( i = 0; i < n; i++)
	            ar[i] =sc.nextInt();
	        Arrays.sort(ar);
       
        for( j=0;j<n-1; j++)
        {
            if(ar[j]!=ar[j+1])
            cnt++;
            
        }
        System.out.println(cnt);
       
}}
//Author:SumanMore/
// User id: https://cses.fi/user/32360
//Solution: https://cses.fi/problemset/result/1081113/