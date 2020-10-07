
/*
Consider an algorithm that takes as input a positive integer n. 
If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.
*/
//https://cses.fi/problemset/task/1068


import java.util.*;
public class weird {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
            System.out.print(n+" ");
        while(n!=1)
          {
          
            if(n%2==0)
                n/=2;
            else
                n=(n*3)+1;
          
          System.out.print(n+" ");
          }
    }
}
// AUTHOR:SumanMore
// User id: https://cses.fi/user/32360
//solution:https://cses.fi/problemset/result/1073408/
   

        
 
