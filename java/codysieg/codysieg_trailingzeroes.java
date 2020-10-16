/**
 * Cody Siegmann
 * cses.fi/Bergis
 * Author: Cody Siegmann
 * Profile: https://cses.fi/user/34341
 *
 *
 Your task is to calculate the number of trailing zeros in the factorial n!.

 For example, 20!=2432902008176640000 and it has 4 trailing zeros.

 Input

 The only input line has an integer n.

 Output

 Print the number of trailing zeros in n!.

 Constraints
 1≤n≤109
 Example

 Input:
 20

 Output:
 4
 */


import java.util.*;

public class codysieg_trailingzeroes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        countZeroes(n);
    }

    public static void countZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
        {
            count += n / i;
        }
        System.out.println(count);
    }
}
