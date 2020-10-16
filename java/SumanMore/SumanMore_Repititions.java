/*You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
Your task is to find the longest repetition in the sequence. 
This is a maximum-length substring containing only one type of character.*/
//https://cses.fi/problemset/task/1069/

import java.util.*;
public class Repititions {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

    String s = sc.next().toUpperCase();
    char[] ar = s.toCharArray();
        int c = 1,max=1,i;
        
       for (i = 1; i < ar.length; ++i) {
            if (ar[i]==ar[i-1])
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
// AUTHOR:SumanMore
// User id: https://cses.fi/user/32360
//Solution:https://cses.fi/problemset/result/1073434/