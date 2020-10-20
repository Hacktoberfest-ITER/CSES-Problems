/* Reading Books
Question link :https://cses.fi/problemset/task/1631/
There are n books, and Kotivalo and Justiina are going to read them all. For each book, you know the time it takes to read it.

They both read each book from beginning to end, and they cannot read a book at the same time. What is the minimum total time required?

Input

The first input line has an integer n: the number of books.

The second line has n integers t1,t2,…,tn: the time required to read each book.

Output

Print one integer: the minimum total time.

*/





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReadingBooks
{
    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int n = sc.nextInt();

        long []t = new long[n];
        long q =0l;
        long total=0l;
        for(int i = 0;i<n;i++)
        {
            t[i] = sc.nextLong();
            q = Math.max(q,t[i]);


            total+=t[i];
        }
        System.out.println(q>(total-q)?2*q:total);


    }
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

////author : SiddhantJaiswal
// Solutions : https://cses.fi/problemset/result/1136987/