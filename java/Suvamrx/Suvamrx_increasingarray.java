/*You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

Input

The first input line contains an integer n: the size of the array.

Then, the second line contains n integers x1,x2,…,xn: the contents of the array.

Output

Print the minimum number of turns.



link:https://cses.fi/problemset/result/1070707/
*/
import java.util.*;

public class Suvamrx_increasingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        long c = 0;
        for (int i = 1; i < n; ++i) {
            if (arr[i] < arr[i - 1]) {
                c+= arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(c);
    }
}


// author:Suvamrx