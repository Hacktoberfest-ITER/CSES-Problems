/* You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
Link: https://cses.fi/problemset/task/1083/
*/

import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,s=0,s1=0;
		n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n-1;i++)
		{
			a[i]=in.nextInt();
			s=s+a[i];
		}
		for(i=1;i<=n;i++)
		{
			s1=s1+i;
		}
		System.out.println(s1-s);

	}

}

/* Author: Palak Srivastava
profile link: profile link: https://cses.fi/user/32824
*/
