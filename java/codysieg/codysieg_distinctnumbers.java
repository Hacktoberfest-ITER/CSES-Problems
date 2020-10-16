/**
 * Cody Siegmann
 * cses.fi/Bergis
 * Author: Cody Siegmann
 * Profile: https://cses.fi/user/34341
 *
 *
 You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

 Input

 The first input line has an integer n: the number of values.

 The second line has n integers x1,x2,…,xn.

 Output

 Print one integers: the number of distinct values.

 Constraints
 1≤n≤2⋅105
 1≤xi≤109
 Example

 Input:
 5
 2 3 2 2 3

 Output:
 2
 */

import java.util.*;

public class codysieg_distinctnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String s = input.nextLine();

        distinct(n, s);
    }

    public static void distinct(int n, String s) {
        int[] arr = new int[n];
        String[] a = s.split(" ");

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }

        Arrays.sort(arr);

        int count = 1;
        for(int i = 0; i < a.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}