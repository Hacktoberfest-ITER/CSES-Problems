//Repetition
//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
//Problem Link: https://cses.fi/problemset/task/1069/

//Solution: https://cses.fi/problemset/result/1066886/
//Author: souravbera
import java.util.*;
public class Zeoshark_Repetition
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        String s= in.next();
        //because initally for any char his/her count is 1.
        int count=1, MaxCount=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i))
            count++;
            else
            count=1;
            //reinitialising to single count=1
            MaxCount= Math.max(MaxCount,count);
        }

        System.out.println(MaxCount);
        in.close();
    }
}