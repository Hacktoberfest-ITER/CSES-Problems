/*You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

Input

The only input line contains a string of n characters.

Output

Print one integer: the length of the longest repetition.

link:https://cses.fi/problemset/result/1075485/
*/
import java.util.*;

public class Suvamrx_repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 1;
        int max = 1;
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i]==arr[i-1])
            {
                c++;
            }
            else
            {
                if (c>max)
                    max=c;
                c=1;
            }
        }
        if (c>max)
            max=c;
        System.out.println(max);
    }
}

// author:Suvamrx