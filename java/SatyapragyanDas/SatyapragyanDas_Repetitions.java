//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
// Question Link: https://cses.fi/problemset/task/1069


import java.util.Scanner;
public class Repetitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
        String input=s1.nextLine();
        s1.close();
        int count=1, max=1;
        for (int i=1;i<input.length();i++) {
            if (input.charAt(i)==input.charAt(i - 1)) {
                count++;
                max = Math.max(max, count);
            } else
                count = 1;
        }
        System.out.println(max);
	}
}
//author: SatyapragyanDas
//profile: https://cses.fi/user/32452