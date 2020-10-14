//Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd,
// the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
//3→10→5→16→8→4→2→1
//Your task is to simulate the execution of the algorithm for a given value of n.
//Link : https://cses.fi/problemset/task/1068

import java.util.*;
public class weirdAlgo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		StringBuilder s=new StringBuilder();
		while(n!=1) {
			s.append(n+" ");
			if(n%2==0) {
				n/=2;
			}
			else 
				n=n*3+1;
		}
		s.append(1);
		System.out.println(s);

	}

}

//Author Palak Srivastava
//profile link: https://cses.fi/user/32824