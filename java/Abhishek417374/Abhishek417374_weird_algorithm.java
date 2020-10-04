/*Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3→10→5→16→8→4→2→1

Your task is to simulate the execution of the algorithm for a given value of n.	*/

//https://cses.fi/problemset/task/1068

//author:Abhishek417374


import java.util.Scanner;

public class Abhishek417374_weird_algorithm{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		while(n!=1) {
			System.out.println(n);
			if(n%2==0)
				n=n/2;
			else
				n=n*3+1;
		}
		System.out.println(1);

	}




	}


