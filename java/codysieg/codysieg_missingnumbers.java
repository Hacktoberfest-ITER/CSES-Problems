/**
 * Cody Siegmann
 * cses.fi/Bergis
 * Author: Cody Siegmann
 * Profile: https://cses.fi/user/34341
 *
 *
 You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

 Input

 The first input line contains an integer n.

 The second line contains n−1 numbers. Each number is distinct and between 1 and n (inclusive).

 Output

 Print the missing number.

 Constraints
 2≤n≤2⋅105
 Example

 Input:
 5
 2 3 1 5

 Output:
 4
 */

import java.util.*;

public class codysieg_missingnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String s = input.nextLine();

        findMissingNumber(n, s);
    }

    public static void findMissingNumber(int n, String s) {
        String[] a = s.split(" ");
        int[] arr = new int[n];

        for(int i = 0; i < a.length; i++) {
            int temp = Integer.parseInt(a[i]);
            arr[temp-1]++;
        }

        int val = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) val = i;
        }

        System.out.println(val + 1);

    }
}