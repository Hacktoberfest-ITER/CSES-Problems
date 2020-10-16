/**
 * Cody Siegmann
 * cses.fi/Bergis
 * Author: Cody Siegmann
 * Profile: https://cses.fi/user/34341
 *
 *
 * You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
 *
 * Input
 *
 * The only input line contains a string of n characters.
 *
 * Output
 *
 * Print one integer: the length of the longest repetition.
 *
 * Constraints
 * 1≤n≤106
 * Example
 *
 * Input:
 * ATTCGGGA
 *
 * Output:
 * 3
 */

import java.util.*;

public class codysieg_repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        longestSubString(s);
    }

    public static void longestSubString(String s) {
        int totalMax = 1;
        int currentMax = 1;
        char a = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == a) {
                currentMax++;
                if(currentMax > totalMax) totalMax = currentMax;
            }
            else {
                if(currentMax > totalMax) totalMax = currentMax;
                a = temp;
                currentMax = 1;
            }
        }
        System.out.println(totalMax);
    }
}
