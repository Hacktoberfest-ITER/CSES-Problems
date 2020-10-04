/*You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
*/

//https://cses.fi/problemset/task/1083/

import java.util.*;

public class SouravReal_Missing_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt() ;
		int S = 0;
		for(int i=0;i<n-1;i++)
		{
			int num = s.nextInt() ;
			S+=num ;
		}
		System.out.println(((n*(n+1))/2)-S);
		s.close();
		
	}

}

//Author : SouravReal a.k.a Sourav_K_P
//Profile: https://cses.fi/user/32489
//Result : https://cses.fi/problemset/result/1082618/