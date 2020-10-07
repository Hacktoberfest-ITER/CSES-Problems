


//Consider an algorithm that takes as input a positive integer n. 
//If n is even, the algorithm divides it by two, and if n is odd, 
//the algorithm multiplies it by three and adds one. 
//The algorithm repeats this, until n is one. 
//For example, the sequence for n=3 is as follows:

//author:ankitsaebby

import java.util.Scanner;

public class ankitsaebbyWeirdAlgorithm {
	public static void main(String[] args) {
		
		//System.out.println("Input your number");
		Scanner sc= new Scanner(System.in);
		long n= sc.nextLong();
		System.out.print(n);
		while(n>1) {
			if(n%2==0) {
				n=n/2;
				System.out.print(" "+n);
			}
			else {
				n=(n*3)+1;
				System.out.print(" "+n);
			}
		}

	}

}
//cses id - https://cses.fi/user/32538
