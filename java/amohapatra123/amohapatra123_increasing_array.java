/*You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
 */
 
//https://cses.fi/problemset/task/1094/

//author:amohapatra123


import java.util.Scanner;
public class amohapatra123_increasing_array
{
    public static void main(String args[])
    {   
        long count=0;
        Scanner y= new Scanner(System.in);
        int n=y.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=y.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            
            if(arr[i-1]>arr[i])
            {
                count= count+(arr[i-1]-arr[i]);
                arr[i]= arr[i-1];
            }
        }
        System.out.println(count);
    }
}