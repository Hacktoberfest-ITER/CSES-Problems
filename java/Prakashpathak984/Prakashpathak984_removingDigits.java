// You are given an integer n. On each step, you may substract from it any one-digit number that appears in it. How many steps are required to make the number equal to 0?
// Link : https://cses.fi/problemset/task/1637

import java.util.Scanner;
public class Prakashpathak984_removingDigits
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(removeDigits(n,0));
		
	}
	
	public static int removeDigits(int n,int c)
	{
	    int x=n;
	    int d=0;
	    while(x!=0)
	    {
	        int temp=x%10;
	        if(d<temp)
	            d=temp;
	        x/=10;
	    }
	    n-=d;
	    c++;
	    if(n!=0)
	    {
	        c=removeDigits(n,c);
	    }
	    return c;
	}
}

// Author : Prakashpathak984
// CSES Profile Link : https://cses.fi/user/32961