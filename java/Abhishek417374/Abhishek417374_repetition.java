
/*You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
import java.util.Scanner;*/
//https://cses.fi/problemset/task/1069
//Author:Abhishek417374
public class Abhishek417374_repetition{

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		String s=S.next().toUpperCase();
		int count=1,max=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i))
				count=count+1;
			else
				count=1;
			max=Math.max(count,max);
		}
		System.out.println(max);

	}

}
