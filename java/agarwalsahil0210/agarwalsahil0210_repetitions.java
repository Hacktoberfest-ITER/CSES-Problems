//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
// Question Link: https://cses.fi/problemset/task/1069


import java.util.*;
public class repititions {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        
        int count=1, max=1;
        for (int i=1;i<str.length();i++) {
            if (str.charAt(i)==str.charAt(i - 1)) {
                count++;
                max = Math.max(max, count);
            } else
                count = 1;
        }
        System.out.println(max);
	}
}

//Author: agarwalsahil0210

//User id: https://cses.fi/user/32363