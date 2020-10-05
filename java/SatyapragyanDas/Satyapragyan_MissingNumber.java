//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

// Question Link: https://cses.fi/problemset/task/1083/

import java.util.Scanner;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		long n=s1.nextInt();
		long input=0;
		long total=0;
		long sum=((n*(n+1)/2));
		for(int i=1;i<n;i++) {
			input=s1.nextInt();
			total+=input;
		}
		System.out.println(sum-total);
	}

}
//author: SatyapragyanDas
//profile: https://cses.fi/user/32452
