//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
//question link:https://cses.fi/problemset/task/1069/
import java.util.Scanner;
public class RIJULDAS_repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int p=1, u=1;
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
               p++;
                u=Math.max(u,p);
            }
           else
                p=1; 
        }
        System.out.println(u);
        sc.close();
    }
}

//author: RijulDas
//result link:https://cses.fi/problemset/result/1082307/
//user id: https://cses.fi/user/32349
