// You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
// https://cses.fi/problemset/task/1094
import java.io.*;
import java.util.Arrays;
public class IncreasingArray 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		String s=in.readLine();
		long m[]=getArray(s,n);
		long c=minSteps(m);
		System.out.println(c);
		//minSteps(m);
	}
	public static long[] getArray(String s,int n)
	{
		s=s+' ';
		long m[]=new long[n];
		int f=0;
		char ch;
		String tmp="";
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				tmp=tmp+ch;
			else 
			{
				m[f]=Long.parseLong(tmp);
				f=f+1;
				tmp="";
			}
		}
		return(m);
	}
	public static long minSteps(long m[])
	{
		long c=0;
		for(int i=1;i<m.length;i++)
		{
			if(m[i-1]>m[i])
			{
				c=c+(m[i-1]-m[i]);
				m[i]=m[i-1];
			}
		}
				
		return(c);
	}
}
// author: rahulkumarjha21
// profile: https://cses.fi/user/32483
