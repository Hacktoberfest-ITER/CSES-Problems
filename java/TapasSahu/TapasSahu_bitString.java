/*
Your task is to calculate the number of bit strings of length n.

For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.

Input

The only input line has an integer n.

Output

Print the result modulo 109+7.

Constraints
1≤n≤106
Example

Input:
3

Output:
8
link:https://cses.fi/problemset/task/1617/
*/
import java.util.Scanner;

public class TapasSahu_bitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bit(n));
        sc.close();
    }

    public static long bit(long n) {
        long x = 2;
        for (int i = 1; i < n; i++) {
            x *= 2;
            x %= 1000000007;
        }
        return x % 1000000007;
    }
}
//author:Tapas Sahu
//profile:https://cses.fi/problemset/task/1617/