/*
You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

*/

import java.util.*;
public class DistinctNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] != arr[j + 1])
                count++;

        }
        System.out.println(count);

    }
}

/*
 author : Jigyasa-Samal
 profile : https://cses.fi/user/32531
*/
