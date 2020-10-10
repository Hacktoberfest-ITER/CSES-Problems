//You are given an integer n. On each step, you may substract from it any one-digit number that appears in it.How many steps are required to make the number equal to 0?
//LINK:-https://cses.fi/problemset/task/1637
import java.util.Scanner;
public class Shivangibose_Removing_Digits
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
	        int t=x%10;
	        if(d<t)
	            d=t;
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

//AUTHOR:Sh161101
//PROFILE LINK:https://cses.fi/user/32657