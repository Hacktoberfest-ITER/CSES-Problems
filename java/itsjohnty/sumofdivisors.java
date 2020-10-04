/*Let σ(n) denote the sum of divisors of an integer n. For example, σ(12)=1+2+3+4+6+12=28.
Your task is to calculate the sum ∑ni=1σ(i) modulo 10^9+7.
link:https://cses.fi/problemset/result/1070913/
*/
import java.util.*;

public class sumofdivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        long i;
        for (i = 1; i * i <= n; ++i) {
            sum += ((n / i) * i);
            sum %= 1000000007;
        }
        long marker = i;
        for (long occur = 1; occur * occur <= n; ++occur) {
            sum += (occur * (sum_ap(Math.max(n / (occur + 1) + 1, marker), n / occur))) % 1000000007;
            sum %= 1000000007;
        }
        System.out.println(sum % 1000000007);
    }
    static long sum_ap(long start, long end) {
        long num = end - start + 1;
        if (num % 2 == 0)
            return (((num / 2) % 1000000007) * ((start + end) % 1000000007)) % 1000000007;
        else
            return ((num % 1000000007) * (((start + end) / 2) % 1000000007)) % 1000000007;
    }
}
//author:itsjohnty