// You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
// https://cses.fi/problemset/task/1083/
import java.util.Scanner;
public class missingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long b=0,d;
        for(long i=1;i<n;i++){
            long a=sc.nextInt();
            b+=a;
        }
        d=(n*(n+1)/2)-b;
        System.out.println(d);
}
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401
    
