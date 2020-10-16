// AUTHOR
// Bravish ghosh
// USER ID
// https://cses.fi/user/34034
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1068/
// QUESTION
// Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows: 3→10→5→16→8→4→2→1 . Your task is to simulate the execution of the algorithm for a given value of n.

import java.io.*;
 
public class LoopGlitch26_WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n != 1) {
            sb.append(n + " ");
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
        }
        sb.append(1);
        System.out.println(sb);
    }
}
