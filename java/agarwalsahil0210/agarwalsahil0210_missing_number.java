//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

// Question Link: https://cses.fi/problemset/task/1083/


//Result link: https://cses.fi/problemset/result/1094383/


import java.util.Scanner;
public class missingNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextInt();
		long input=0;
		long total=0;
		long sum=((n*(n+1)/2));
		for(int i=1;i<n;i++) {
			input=in.nextInt();
			total+=input;
		}
		System.out.println(sum-total);
	}

}

//Author: agarwalsahil0210

//User id: https://cses.fi/user/32363