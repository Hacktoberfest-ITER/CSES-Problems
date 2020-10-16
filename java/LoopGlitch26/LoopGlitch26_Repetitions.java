// AUTHOR
// Bravish ghosh
// USER ID
// https://cses.fi/user/34034
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1069
// QUESTION
// You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

import java.io.*;

public class LoopGlitch26_Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        int n = ch.length, ans = 1, p = 1;
        for (int i = 1; i < n; i++) {
            if (ch[i] == ch[i - 1])
                p++;
            else
                p = 1;
            if (ans < p)
                ans = p;
        }
        System.out.println(ans);
    }
}