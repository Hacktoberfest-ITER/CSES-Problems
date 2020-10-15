//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
//https://cses.fi/problemset/task/1083/

import java.util.*;
public class UtkarshShankar_Missing_number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num;
		num=in.nextInt();
		int i,sum=0,p,k=0;
		for(i=0;i<(num-1);i++)
		{
			p=in.nextInt();
			k=k+p;
			sum+=i;
		}
		sum+=num+(num-1);
		System.out.println(sum-k);
		
	}

}

//author : Utkarsh Shankar
//profile: https://cses.fi/user/32339

