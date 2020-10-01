//Distinct Numbers
//https://cses.fi/problemset/task/1621/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

class SiddhantJaiswalDistinctNumbers
{
    public static void main(String[] args)
    {

        FastReader sc = new FastReader();
        int n = sc.nextInt();

        HashSet <Long>  bag = new HashSet<Long>();
        for(int i = 0; i < n; i++)
        {
            bag.add(sc.nextLong());
        }
        System.out.println(bag.size());

    }


//    Alternative of Scanner Class to get Fast Input
    static class FastReader
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
}

//author : SiddhantJaiswal-0125
//Solution : https://cses.fi/problemset/result/1067152/


