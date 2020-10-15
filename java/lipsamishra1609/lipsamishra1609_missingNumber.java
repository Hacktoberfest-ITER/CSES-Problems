/*
 You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
 Input
 The first input line contains an integer n.
 The second line contains n−1 numbers. Each number is distinct and between 1 and n (inclusive).
 Output
 Print the missing number.
 
link: https://cses.fi/problemset/task/1083
author: Lipsa Mishra
profile: https://cses.fi/user/32829
*/

import java.util.Scanner;
public class lipsamishra1609_missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        boolean[] arr = new boolean[n];
	        for (int i=0; i<n-1; ++i) 
	        {
	           int tmp = sc.nextInt();
	           arr[tmp-1] = true;
	        }
	        for (int i = 0; i < n; ++i) {
	            if (arr[i]==false) {
	                System.out.println(i + 1);
	                break;
	            }
	        }
	}


}
