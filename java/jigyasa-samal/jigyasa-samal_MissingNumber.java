/*
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

*/

import java.util.*;
public class MissingNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long ele = 0, i, op, sum = 0;
        for (i = 1; i < n; i++) {
            ele = sc.nextInt();
            sum = sum + ele;
        }
        op = (n * (n + 1) / 2) - sum;
        System.out.println(op);

    }
}

/*
    author : jigyasa-samal
    profile : https://cses.fi/user/32531
*/
