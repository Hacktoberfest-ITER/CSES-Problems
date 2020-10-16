//  Consider an algorithm that takes as input a positive integer n. 
//  If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies 
//  it by three and adds one. The algorithm repeats this, until n is one. For example, the 
//  sequence for n=3 is as follows:

//					3→10→5→16→8→4→2→1

//  Your task is to simulate the execution of the algorithm for a given value of n.

//  https://cses.fi/problemset/task/1068

import java.util.*;

public class SouravReal_Weird_Algorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		while(n!=1) {
		if(n%2!=0)
		{
			System.out.print(n+" ");
			n*=3;
			n+=1 ;
		}
		else
		{
			System.out.print(n+" ");
			n/=2 ;
		}

	}
		System.out.print(n);

	}

}

//Author : SouravReal a.k.a Sourav_K_P
//Profile: https://cses.fi/user/32489
//Result : https://cses.fi/problemset/result/1073160/
