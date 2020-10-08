/*You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
On each turn, you may increase the value of any element by one. What is the minimum number of turns required?*/
//https://cses.fi/problemset/task/1094/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {

	public static void main(String[] args) {
	FastReader fr=new FastReader();
		int n=fr.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=fr.nextInt();
		}
		long turns=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) {
				turns+=Math.abs(a[i]-a[i+1]);
				a[i+1]=a[i];
			}
		}
		System.out.println(turns);
		

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
