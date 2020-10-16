/*
You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
Example:

Input:
5
2 3 2 2 3

Output:
2
*/

//https://cses.fi/problemset/task/1621/

//author:amohapatra123




import java.util.Scanner;
import java.util.Arrays;
public class amohapatra123_distinct_numbers{
    public static boolean same(int arr[]){
        boolean flag=true;
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(i==(l-1)){
                if(arr[i]==arr[i-1]){
                    continue;
                }else{
                    flag=false;
                }
            }
            if(arr[i]==arr[i+1]){
                continue;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[]){
   Scanner y= new Scanner(System.in);
   int n=y.nextInt();
   int arr[]= new int[n];
   for(int i=0;i<n;i++){
       arr[i]=y.nextInt();
   }
   Arrays.sort(arr);
   boolean flag=same(arr);
   int count=0;
  
    if(flag){
        count=1;
    }else{
         for(int i=0;i<n;i++){
       if(i==n-1){
          if(arr[i]==arr[i-1]){
              count=count;
          }else{
              count++;
          }
          break;
       }else if(arr[i]==arr[i+1]){
           count=count;
       }else{
           count++;
       }
   }
    }
  System.out.println(count);
    }
}