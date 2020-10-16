// You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
// https://cses.fi/problemset/task/1069/

//author: KejariwalAyush

import java.util.Scanner;

public class kejariwalAyush_repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int cnt = 1, max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
                max = Math.max(max, cnt);
            } else
                cnt = 1;
        }
        System.out.println(max);
        sc.close();
    }
}
