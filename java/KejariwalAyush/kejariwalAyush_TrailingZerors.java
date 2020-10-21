// Your task is to calculate the number of trailing zeros in the factorial n!.

// For example, 20!=2432902008176640000 and it has 4 trailing zeros.
//https://cses.fi/problemset/task/1618/ 

//author: KejariwalAyush

import java.util.Scanner;

public class kejariwalAyush_TrailingZerors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int cnt = 0;
        for (int i = 5; i <= n; i *= 5) {
            cnt += n / i;
        }
        System.out.println(cnt);
    }

}
