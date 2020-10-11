//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
//link : https://cses.fi/problemset/task/1069

import java.util.Scanner;

public class SouravReal_Repetitions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String DNA = s.nextLine();
        int p=1, u=1;
        for(int i=0; i<DNA.length()-1; i++)
        {
            if(DNA.charAt(i)==DNA.charAt(i+1))
            {
               p++;
                u=Math.max(u,p);
            }
           else
                p=1; 
        }
        System.out.println(u);
        s.close();

	}

}

//Author : SouravReal a.k.a Sourav_K_P
//Profile: https://cses.fi/user/32489
//Result : https://cses.fi/problemset/result/1088129/