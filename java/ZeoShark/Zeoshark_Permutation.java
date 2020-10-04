//Permutation
//A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.

// Given n, construct a beautiful permutation if such a permutation exists.

//Problem Link: https://cses.fi/problemset/task/1070/

//Solution: https://cses.fi/problemset/result/1068418/
// author: souravbera
import java.util.*;
public class Zeoshark_Permutation{

    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        if(n==1)
            System.out.print("1");
        else if(n<4)
            System.out.print("NO SOLUTION");
        else if(n==4)
            System.out.print("2 4 1 3");
        else{
            //for odds
            for(int i=1;i<=n;i+=2)
                System.out.print(i+" ");
            //for evens
            for(int i=2;i<=n;i+=2)
                System.out.print(i+" ");
        }
    }
}