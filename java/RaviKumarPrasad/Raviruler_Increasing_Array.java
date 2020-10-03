/*
 You are given an array of n integers.
  You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
 
link:https://cses.fi/problemset/task/1094/

Input:
5
3 2 5 1 7

Output:
5

 */
import java.util.Scanner;
public class Raviruler_Increasing_Array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long minturn=0;
		int n=scan.nextInt();
		int a[]=new int [n];
		a[0]=scan.nextInt();
		for(int i=1;i<n;i++) {
			a[i]=scan.nextInt();
			if(a[i-1]>a[i])
			{
				minturn+=(a[i-1]-a[i]);
				a[i]=a[i-1];
			}
		}
		System.out.print(minturn);
	}
}
//Author: Ravi Kumar Prasad
//Git_hub Id: Raviruler
//cses : https://cses.fi/user/32356/