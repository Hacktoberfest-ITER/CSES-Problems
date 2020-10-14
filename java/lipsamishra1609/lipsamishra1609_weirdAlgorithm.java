/*
Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3→10→5→16→8→4→2→1
Input
The only input line contains an integer n.
Output
Print a line that contains all values of n during the algorithm.

link : https://cses.fi/problemset/task/1068
author: Lipsa Mishra
profile: https://cses.fi/user/32829
*/

import java.util.Scanner;
public class lipsamishra1609_weirdAlgorithm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         long n=sc.nextInt();
         long a=n;
         System.out.print(a+" ");
         while(n>1)
         {
        	
        	 if(n%2==0)
        	 {
        		 n=n/2;
        	 }
        	 else
        	 {
        		 n=(n*3)+1;
        	 }
        	 System.out.print(n+" ");
        	
         }
	}


}
