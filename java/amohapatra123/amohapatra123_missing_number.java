/*You are given all numbers between 1,2,…,n except one.
 Your task is to find the missing number.
*/
//https://cses.fi/problemset/task/1083/


//author:amohapatra123

import java.util.Scanner;
public class amohapatra123_missing_number{
    public static void main(String args[]){
        Scanner y= new Scanner(System.in);
        int n=y.nextInt();
        int arr[]= new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=y.nextInt();
        }
        int missing=1;
     
        for(int i=2;i<=n;i++){
          missing+=i-arr[i-2];
        }
      
        System.out.print(missing);
 
    }
}