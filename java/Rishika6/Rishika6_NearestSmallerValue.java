/*Given an array of n integers, your task is to find for each array position the nearest position to its left having a smaller value.*/
//Link-->https://cses.fi/problemset/task/1645/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class NearestSmallerValue {

	public static void main(String[] args) {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		FastReader fr=new FastReader();
		try {
		int n=fr.nextInt();
		//String s=br.readLine();
		//String parts[]=s.split(" ");
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i]=fr.nextInt();
		}
		int sl[]=new int[n+1];
		sl[1]=0;
		
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		for(int i=2;i<=n;i++) {
			while(!stack.isEmpty()&&a[stack.peek()]>=a[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				sl[i]=0;
			}
			else {
			int idx=stack.peek();
			sl[i]=idx;
			}
			stack.push(i);
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(sl[i]+" ");
		}
		}catch(Exception e) {
			
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