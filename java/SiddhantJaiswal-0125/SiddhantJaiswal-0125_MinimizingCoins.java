//// Minimizing Coins
////Question link :  https://cses.fi/problemset/task/1634/
///*Problem Statement :
//*
//* Consider a money system consisting of n coins. Each coin has a positive integer value. Your task is to produce a sum of money x using the available coins in such a way that the number of coins is minimal.
//
//For example, if the coins are {1,5,7} and the desired sum is 11, an optimal solution is 5+5+1 which requires 3 coins.
//
//Input
//
//The first input line has two integers n and x: the number of coins and the desired sum of money.
//
//The second line has n distinct integers c1,c2,…,cn: the value of each coin.
//
//Output
//
//Print one integer: the minimum number of coins. If it is not possible to produce the desired sum, print −1.
//
//Constraints
//1≤n≤100
//1≤x≤106
//1≤ci≤106
//*
//* */
//
//
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.StringTokenizer;
//
//public class SiddhantJaiswalMinimizingCoins
//{
//    public static void main(String[] args)
//    {
//
//       FastReader sc = new FastReader();
//       int n   = sc.nextInt();
//       int total = sc.nextInt();
//        int c[] = new int[n];
//        for(int i = 0; i < n;i++)
//            c[i]  = sc.nextInt();
//        System.out.println(solve(c,n,total));
//    }
//
//    static int solve(int coins[], int m, int total)
//    {
//
//        int table[] = new int[total + 1];
//        Arrays.fill(table,Integer.MAX_VALUE);
//
//        int result2;
//        table[0] = 0;
//        for (int i = 1; i <= total; i++)
//        {
//            for (int j = 0; j < m; j++)
//                if (coins[j] <= i)
//                {
//                    result2= table[i - coins[j]];
//                    if ((result2 + 1) < table[i]&& result2 != Integer.MAX_VALUE )
//                        table[i] = result2 + 1;
//                }
//
//        }
//        if(table[total]==Integer.MAX_VALUE)
//            return -1;
//
//        return table[total];
//
//    }
//
//
//    //    Alternative of Scanner Class to get Fast Input
//    static class FastReader
//    {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastReader()
//        {
//            br = new BufferedReader(new
//                    InputStreamReader(System.in));
//        }
//
//        String next()
//        {
//            while (st == null || !st.hasMoreElements())
//            {
//                try
//                {
//                    st = new StringTokenizer(br.readLine());
//                }
//                catch (IOException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt()
//        {
//            return Integer.parseInt(next());
//        }
//
//        long nextLong()
//        {
//            return Long.parseLong(next());
//        }
//
//        double nextDouble()
//        {
//            return Double.parseDouble(next());
//        }
//
//        String nextLine()
//        {
//            String str = "";
//            try
//            {
//                str = br.readLine();
//            }
//            catch (IOException e)
//            {
//                e.printStackTrace();
//            }
//            return str;
//        }
//    }
//}
//
//
////author : SiddhantJaiswal
////Solution : https://cses.fi/problemset/result/1068397/
