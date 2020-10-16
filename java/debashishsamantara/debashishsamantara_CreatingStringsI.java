//Author : debashishsamantara
//Profile : https://cses.fi/user/32389
/*Ques. : Given a string, your task is to generate all different strings that can be created using its characters.

 Input
 The only input line has a string of length n. Each character is between a–z.

 Output
 First print an integer k: the number of strings. Then print k lines: the strings in alphabetical order.*/

import java.util.*;
public class debashishsamantara_CreatingStringsI 
{ 
  		static final int MAX_CHAR = 26;  
        static boolean shouldSwap(char str[], int start, int curr) 
        { 
            for (int i = start; i < curr; i++) { 
                if (str[i] == str[curr]) { 
                    return false; 
                } 
            } 
            return true; 
        }   
        static void findPermutations(char str[], int index, int n) { 
            if (index >= n) { 
                System.out.println(str); 
                return; 
            } 
            for (int i = index; i < n; i++) {  
                boolean check = shouldSwap(str, index, i); 
                if (check) { 
                    swap(str, index, i); 
                    findPermutations(str, index + 1, n); 
                    swap(str, index, i); 
                } 
            } 
        } 
      
        static void swap(char[] str, int i, int j) { 
            char c = str[i]; 
            str[i] = str[j]; 
            str[j] = c; 
        } 
        static int factorial(int n) 
	    { 
	        int fact = 1; 
	        for (int i = 2; i <= n; i++) 
	            fact = fact * i; 
	        return fact; 
	    }  
        static int countDistinctPermutations(String str) 
        { 
            int length = str.length(); 
        
            int[] freq = new int[MAX_CHAR];  
            for (int i = 0; i < length; i++) 
                if (str.charAt(i) >= 'a') 
                    freq[str.charAt(i) - 'a']++;
                else
                    freq[str.charAt(i) - 'A']++; 
            int fact = 1; 
            for (int i = 0; i < MAX_CHAR; i++) 
                fact = fact * factorial(freq[i]);  
            return factorial(length) / fact; 
        } 
        public static void main(String[] args)
         { 
      		Scanner sc = new Scanner(System.in);
      		String s = sc.nextLine();
            char str[] = s.toCharArray(); 
            System.out.println(countDistinctPermutations(s));
            int n = str.length; 
            findPermutations(str, 0, n); 
            sc.close();
        } 
      
} 