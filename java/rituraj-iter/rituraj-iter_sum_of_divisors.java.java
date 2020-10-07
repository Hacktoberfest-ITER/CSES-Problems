/*Let σ(n) denote the sum of divisors of an integer n. For example, σ(12)=1+2+3+4+6+12=28.
Your task is to calculate the sum ∑ni=1σ(i) modulo 109+7.*/
// https://cses.fi/problemset/task/1082/
import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        final long m_mod=1000000007;
        Scanner sc=new Scanner(System.in);
        long n =sc.nextLong();
        long s = 0;
        for (long i=1;i<=n/i;i++) {
            long q=n/i;
            s=(s+i*q)%m_mod;
            if (i!=q) {
                long p=n/(i + 1);
                p%=m_mod;
                q%=m_mod;
                long k=(q-p)*(q+p+1)/2%m_mod;
                s=(s+k*i)%m_mod;
            }
        }
        if (s<0){
            s+=m_mod;
        }
        System.out.println(s);
    }
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401