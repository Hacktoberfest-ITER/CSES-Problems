/*You are given a list of n integers, and your task is to calculate the number of distinct values in the list.*/
//https://cses.fi/problemset/task/1621
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class DistinctNumbers {
    
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    FastReader fr=new FastReader();
	    try {
	    int n=fr.nextInt();
	    //System.out.println(n);
	    Set<Integer> set=new HashSet<>();
	    while(n-->0){
	     int v=fr.nextInt();
	      set.add(v);
	     }
	    System.out.println(set.size());
	    }catch(Exception e){
	    	
	    }
	   }
	
}
class FastReader
{
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
//author:Rishika
//https://cses.fi/user/32327