//You are given all numbers between 1,2,3,n except one. Your task is to find the missing number.
//Example

//Input:
//5
//2 3 1 5

//Output:
//4
//Link:-https://cses.fi/problemset/task/1083
//*/
import java .util.*;
public class missingnumber 
{
	public static void main(String args[])
	{   Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int aa[]=new int[n+1];
		for(int i=0;i<n-1;i++)
		{
			int a=sc.nextInt();
			aa[a]++;
		}
		for(int i=1;i<=n;i++)
		{
			if(aa[i]==0)
				System.out.print(i+" ");
		}
		
	}

}
//Author: Priyesh kumar Chudhary
// Git_hub Id: PriyeshChoudhary
//cses: https://cses.fi/user/32279