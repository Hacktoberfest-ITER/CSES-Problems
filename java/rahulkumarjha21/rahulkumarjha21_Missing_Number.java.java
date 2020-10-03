// You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
// https://cses.fi/problemset/task/1083
import java.io.*;
public class MissingNumber 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		String s=in.readLine();
		s=s+' ';
		int m[]=getArray(n,s);
		getMissing(m);
	}
	public static int[] getArray(int n,String s)
	{
		int x;
		char ch;
		String tmp="";
		int m[]=new int[n+1];
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				tmp=tmp+ch;
			else
			{
				x=Integer.parseInt(tmp);
				m[x]=x;
				tmp="";
			}
		}
		return(m);
	}
	public static void getMissing(int m[])
	{
		for(int i=1;i<m.length;i++)
		{
			if(m[i]==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
// author: rahulkumarjha21
// profile: https://cses.fi/user/32483