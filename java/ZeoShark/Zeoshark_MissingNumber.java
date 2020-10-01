//Missing Number
//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

//Problem link: https://cses.fi/problemset/task/1083/
//Solution: https://cses.fi/problemset/result/1066735/

//Author: souravbera
//UserId: https://cses.fi/user/32264
import java.util.*;
public class Zeoshark_MissingNumber {
 public static void main(String args[])
 {
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
   
    int a[]= new int[n-1];
    for(int i=0;i<n-1;i++)
    {
        a[i]= in.nextInt();
    }
    // String input= in.nextLine();
    // String num_arr[]= input.trim().split(" ");
    // for(int i=0;i<num_arr.length;i++)
    //     a[i]= Integer.parseInt(num_arr[i]);
    int total=1;
    for(int j=2;j<=n;j++)
        total=total + j - a[j-2];
    System.out.println(total);
    in.close();
 }
}
