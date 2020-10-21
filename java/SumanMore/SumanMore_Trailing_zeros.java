//Your task is to calculate the number of trailing zeros in the factorial n!.
//https://cses.fi/problemset/task/1618


import java.util.*;
public class trailingzeroes {
    public static void main(String args[])
    {
   int cnt=0,i,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for( i=5; n/i>=1; i*=5)
        {
            cnt=cnt+(n/i);
        }
    
System.out.println(cnt);
    }
}


//Author:SumanMore/
// User id: https://cses.fi/user/32360
//Solution:https://cses.fi/problemset/result/1076224/