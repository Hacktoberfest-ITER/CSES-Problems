/*
* Sum of Two Values
// Question link :https://cses.fi/problemset/task/1640

You are given an array of n integers, and your task is to find two values (at distinct positions) whose sum is x.

Input
The first input line has two integers n and x: the array size and the target sum.
The second line has n integers a1,a2,…,an: the array values.

Output

Print two integers: the positions of the values.
If there are several solutions, you may print any of them. If there are no solutions, print IMPOSSIBLE.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SiddhantJaiswal-0125_SumofTwoValues
{
    public static void main(String[] args)
    {
        Fastio sc = new Fastio();
        int n = sc.nextInt();
        long x = sc.nextLong();
        long dif = -1;
        int index1=0,index2=0;
        boolean b = false;
        if(x%2==0)
        {
            dif = x/2;
            b = true;
        }
        long a [] = new long[n];
        HashSet <Long> bag = new HashSet<>();
        int count = 0;
        for(int i = 0; i<n;i++)
        {
            a[i] = sc.nextLong();
            bag.add(a[i]);

            if(b&&a[i]==dif)
                count++;
        }
        boolean ans = false;
        long ans1=0l,ans2=0l;



        if(b && count>1)
        {
            index1 = search(a,dif,n,-1);
            index2 = search(a,dif,n,index1);

    ans = true;







        }
        else
        {
            for(int i = 0;i<n;i++)
            {

                    long d = x-a[i];
                    if(bag.contains(d) && a[i]!=dif )
                    {

                        ans = true;
                        ans1=a[i];
                        ans2=d;

                    index1 = search(a,ans1,n,-1);
                    index2 = search(a,ans2,n,-1);



                        break;
                    }
                }
        }

        if(ans && (index1!=index2))
        {

            index1++;
            index2++;
            System.out.println(index1+" "+index2);
        }
        else
            System.out.println("IMPOSSIBLE");







    }
    static int search(long  a[],long k,int n ,int before)
    {
        for(int i =0; i < n;i++)
        {
            if(a[i]==k && i!=before)
                return i;
        }

        return -1;
    }

    static class Fastio
    {
        BufferedReader br;
        StringTokenizer st;

        public Fastio()
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


//author : SiddhantJaiswal

//Solution : https://cses.fi/problemset/result/1136038/