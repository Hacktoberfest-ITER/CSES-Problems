//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

//Question Link: https://cses.fi/problemset/task/1094


import java.util.*;

public class increasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long count=0;
		long number=0;
		long []arr=new long[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
			if(i==0) continue;
			else if(arr[i-1]>arr[i]) {
				number=arr[i-1]-arr[i];
				count+=number;
                arr[i]+=number;
			}
			else continue;
		}
		System.out.println(count);
	}

}

//Author: agarwalsahil0210

//User id: https://cses.fi/user/32363