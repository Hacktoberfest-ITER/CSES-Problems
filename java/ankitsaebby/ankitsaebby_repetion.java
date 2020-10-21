


//You are given a DNA sequence: a string consisting of characters A, C, G, and T.
//Your task is to find the longest repetition in the sequence. 
//This is a maximum-length substring containing only one type of character.

//author: ankitsaebby


import java.util.Scanner;
public class ankitsaebby_repetion {

	public static void main(String[] args) {
		System.out.println("input your string");
		Scanner s=new Scanner(System.in);
		String str= s.next().toUpperCase();
		int m=calMax(str);
		System.out.println(m);
	}
	public static int calMax(String str) {
		int max=0,count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++)
				if(str.charAt(i)==str.charAt(j))
					count ++;
			if(count>max) 
				max=count;
			count=0;
		}
		return max;
	}

}
