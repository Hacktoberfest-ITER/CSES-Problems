//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
//Link: https://cses.fi/problemset/task/1094/



import java.util.*;
public class IncreasingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		long turn=0;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=1;i<n;i++)
		{
			if(a[i-1]>a[i])
			{
				turn=turn+ Math.abs(a[i-1]-a[i]);
				a[i]=a[i-1];
			}
		}
		
		System.out.println(turn);

	}

}

//Author: Palak Srivastava
//https://cses.fi/user/32824
