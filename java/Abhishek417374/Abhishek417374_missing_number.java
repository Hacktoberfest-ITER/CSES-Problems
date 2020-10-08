
//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

//https://cses.fi/problemset/result/1103943/

//Author:Abhishek417374


import java.util.Arrays;
import java.util.Scanner;
public class Abhishek417374_missing_number{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n=s.nextInt();
		int a[]=new int[n-1];
		for(i=0;i<(n-1);i++) {
			a[i]=s.nextInt();
		}
		int find=1;
		for(int j=2;j<=n;j++)
			find+=j-a[j-2];
		System.out.println(find);
		

	}

}
