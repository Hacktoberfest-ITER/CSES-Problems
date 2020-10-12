//You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
 
//https://cses.fi/problemset/task/1621
 
//Author:Abhiserk417374

import java.util.Arrays;
import java.util.Scanner;
public class Abhishek417374_distinct_number{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort (a);
		int c=1;
		for(int j=1;j<n;j++) {
			if(a[j-1]!=a[j])
				c=c+1;
		}
		System.out.println(c);

	}

}
