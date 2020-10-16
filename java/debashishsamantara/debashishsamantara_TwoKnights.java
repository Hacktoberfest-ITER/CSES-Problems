// Your task is to count for k=1,2,…,n the number of ways two knights can be placed on a k×k chessboard so that they do not attack each other.
// https : //cses.fi/problemset/task/1072
// Author : debashishsamantara
// Profile : https://cses.fi/user/32389 


import java.util.*;
public class debashishsamantara_TwoKnights{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            for(long i=1; i<=n; i++){
            System.out.println(TwoKnights(i));
            sc.close();
		}
	}
    static long TwoKnights(long n)
    {	
		long th = 4*(n-1)*(n-2);
		long pos = (n*n*(n*n-1))/2;
		return pos-th;
    }
}