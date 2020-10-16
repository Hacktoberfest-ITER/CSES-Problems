//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

//Author : debashishsamantara
//Profile : https://cses.fi/user/32389
//Ques. link : https://cses.fi/problemset/task/1069/


import java.util.Scanner;
public class debashishsamantara_repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int c=1, z=1;
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
               c++;
                z=Math.max(z,c);
            }
            else
            {
                c=1;
            }
        }
        System.out.println(z);
        sc.close();
    }
}
