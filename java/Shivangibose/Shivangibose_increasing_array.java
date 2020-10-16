//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
//LINK:-https://cses.fi/problemset/task/1094
import java.util.*;
public class Shivangibose_increasing_array
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long c=0;
		long z;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int x=0;x<n;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int y=0;y<n-1;y++)
		{
			
			if(a[y+1]<a[y])
			{
				z=0;
				z=a[y]-a[y+1];
				a[y+1]+=z;
				c=c+z;
			}
			
		}
		System.out.println(c);
	}

}

//AUTHOR:-Sh161101
//CSES PROFILE LINK:-https://cses.fi/user/32657