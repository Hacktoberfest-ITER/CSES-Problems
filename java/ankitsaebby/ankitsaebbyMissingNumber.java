//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

//author:ankitsaebby


import java.util.*;
public class ankitsaebbyMissingNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt(),res = 1;
		int a[]=new int[n-1];
		for(int i=0;i<n-1;i++) {
			a[i]=s.nextInt();
		}
		for(int j=2;j<=n;j++)
			res=res+j-a[j-2];
		System.out.print(res);
	}

}

//cses id-  https://cses.fi/user/32538
