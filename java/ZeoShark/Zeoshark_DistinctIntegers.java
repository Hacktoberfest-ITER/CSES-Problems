//Distinct Integers
//You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

//Problem Link: https://cses.fi/problemset/task/1621
// Solution: https://cses.fi/problemset/result/1072944/
//Author: souravbera
import java.util.*;
public class Zeoshark_DistinctIntegers {
   public static void main(String args[])
   {
       int m;
       Scanner in= new Scanner(System.in);
       int n=in.nextInt();
       int a[]= new int[n];
       int pos=1,f=0;
       a[0]= in.nextInt();
       for(int i=1;i<n;i++)
       {
            m= in.nextInt();
            for(int j=0;j<pos;j++) 
            {
                if(a[j]==m)
                f=1;
            }
            if(f==0)
            a[pos++]=m;
       }
       System.out.println(a.length);

   }
}
