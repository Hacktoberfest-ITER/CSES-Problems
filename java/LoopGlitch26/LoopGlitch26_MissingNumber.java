// AUTHOR
// Bravish ghosh
// USER ID
// https://cses.fi/user/34034
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1083/
// QUESTION
// You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

import java.io.*;
import java.util.*;
 
public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] used = new boolean[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            used[a] = true;
        }
        for (int a = 1; a <= n; a++)
            if (!used[a]) {
                System.out.println(a);
                return;
            }
    }
}
