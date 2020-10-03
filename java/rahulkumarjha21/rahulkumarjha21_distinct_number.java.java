// You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
// https://cses.fi/problemset/task/1621/
import java.io.*;
import java.util.Arrays;
public class DistinctNumber 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		String s=in.readLine();
		int m[]=getArray(s,n);
		int c=getDistinct(m);
		System.out.println(c);
	}
	public static int[] getArray(String s,int n)
	{
		s=s+' ';
		int m[]=new int[n];
		char ch;
		String tmp="";
		int f=0;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				tmp=tmp+ch;
			else 
			{
				m[f]=Integer.parseInt(tmp);
				f=f+1;
				tmp="";
			}
		}
		Arrays.sort(m);
		return(m);
	}
	public static int getDistinct(int m[])
	{
		int c=1;
		for(int i=0;i<m.length-1;i++)
		{
			if(m[i]!=m[i+1])
				c=c+1;
		}
		return(c);
	}
}
// author: rahulkumarjha21
// profile: https://cses.fi/user/32483