/*Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3→10→5→16→8→4→2→1
Your task is to simulate the execution of the algorithm for a given value of n.*/
// https://cses.fi/problemset/task/1068
import java.io.*;
public class WeirdAlgorithm 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		printAll(n);
	}
	public static void printAll(long n)
	{
		while(n!=1)
		{
			System.out.print(n+" ");
			if(n%2==0)
				n=n/2;
			else
				n=(n*3)+1;
		}
		System.out.print(n+" ");
	}
}
// author: rahulkumarjha21
// profile: https://cses.fi/user/32483