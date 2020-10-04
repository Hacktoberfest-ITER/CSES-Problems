// You have two coin piles containing a and b coins. On each move, you can either remove one coin from the left pile and two coins from the right pile, or two coins from the left pile and one coin from the right pile.
// https://cses.fi/problemset/task/1754
import java.io.*;
public class CoinPiles 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(in.readLine());
		String s;
		int a,b;
		for(int i=1;i<=t;i++)
		{
			s=in.readLine();
			a=Integer.parseInt(s.substring(0,s.indexOf(' ')));
			b=Integer.parseInt(s.substring(s.indexOf(' ')+1));
			if(a>b)
			{
				int tmp=a;
				a=b;
				b=tmp;
			}
			if(checkEmpty(a,b)==true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}		
	}
	public static boolean checkEmpty(int a,int b)
	{
		if(2*a<b)
			return(false);
		else
		{
			a=a%3;b=b%3;
			if((a==0 && b==0)||(a==1 && b==2)||(a==2&&b==1))
				return(true);
			else
				return(false);
		}
	}
}
// author: rahulkumarjha21
// profile: https://cses.fi/user/32483
