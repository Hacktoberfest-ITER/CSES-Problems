
// Question
// Consider an algorithm that takes as input a positive integer n.
// If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.


// link :- https://cses.fi/problemset/task/1068

// author : Adarsh Padhi

import java.util.*;
public class adarsh1405_weird_algorithm
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    long n = sc.nextLong();
	    System.out.print(n+" ");
	    while(n!=1){
	    if(n%2==0)
	        n/=2;
	    else
	        n=(n*3)+1;
		System.out.print(n+" ");
	    }
	}
}
