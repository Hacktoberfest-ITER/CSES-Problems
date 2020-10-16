//Consider an algorithm that takes as input a positive integer n.
//If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.
//https://cses.fi/problemset/task/1068/

import java.util.*;
class weird_number
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        long n=in.nextLong();
        System.out.print(n);//1st number
        while(n!=1)
        {
            if(n%2==0)
            n=n/2;
            else
            n=n*3+1;
            System.out.print(" "+n);
        }
    }
}

//author: itsjohnty
//https://cses.fi/problemset/result/1065804/












