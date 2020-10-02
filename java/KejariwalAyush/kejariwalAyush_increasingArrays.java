
//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
//Question: https://cses.fi/problemset/task/1094/

//author: KejariwalAyush
import java.util.*;

public class kejariwalAyush_increasingArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long min = 0;
        int n = sc.nextInt();

        int a[] = new int[n];
        a[0] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i - 1] > a[i]) {
                min += (a[i - 1] - a[i]);
                a[i] = a[i - 1];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
