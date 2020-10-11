/*
You are given an array of n integers, and your task is to find two values (at distinct positions) whose sum is x.
Link : https://cses.fi/problemset/task/1640/
*/

import java.util.*;

class SumOfTwoValues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        Set < Integer > set = new HashSet < > ();
        boolean position = false;
        int first = 0;
        int sec = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(x - arr[i])) {
                sec = i;
                position = true;
                break;
            } else
                set.add(arr[i]);
        }
        int v = x - arr[sec];
        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                first = i;
                break;
            }
        }

        if (position == true) {
            System.out.println(first + 1 + " " + (sec + 1));
        } else
            System.out.println("IMPOSSIBLE");
    }
}

/*
  author : jigyasa-samal
  profile link : https://cses.fi/user/32531
*/
