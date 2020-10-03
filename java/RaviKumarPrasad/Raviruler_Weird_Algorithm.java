/*Consider an algorithm that takes as input a positive integer n.
 If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. 
 The algorithm repeats this, until n is one.
 
link : https://cses.fi/problemset/task/1068
*/

import java.util.*;
public class Raviruler_Weird_Algorithm {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	 long n =sc.nextInt();
    	 while(n!=1) {
    	 System.out.print(n + " ");
        if (n % 2 == 0) n=(n / 2);
        else n=(3*n + 1);
    }
    	 System.out.print(n);
    }

}
//Author: Ravi Kumar Prasad
//Git_hub Id: Raviruler
//cses : https://cses.fi/user/32356/