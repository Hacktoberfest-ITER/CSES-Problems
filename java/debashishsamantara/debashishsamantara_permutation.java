//A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1. Given n, construct a beautiful permutation if such a permutation exists.
//Author : debashishsamantara
//Profile : https://cses.fi/user/32389
//Ques. link : https://cses.fi/problemset/task/1070/
import java.util.Scanner;
public class debashishsamantara_permutation
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr = new int[x];
        if(x==1)
        {
            System.out.print("1");
            System.exit(0);
        }
        if(x==2 || x==3)
        {
            System.out.print("NO SOLUTION");
            System.exit(0);
        }
        if(x==4)
        {
            System.out.println("2 4 1 3");
            System.exit(0);
        }    
        for(int i=1; i<=x; i++)
        {
            arr[i-1]=i;
        }
        for(int i=0; i<x; i+=2)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=1; i<x; i+=2)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}