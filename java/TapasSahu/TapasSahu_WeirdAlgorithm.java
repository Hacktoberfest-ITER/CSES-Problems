/*
Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3→10→5→16→8→4→2→1

Your task is to simulate the execution of the algorithm for a given value of n.

Input

The only input line contains an integer n.

Output

Print a line that contains all values of n during the algorithm.

Constraints
1≤n≤106
Example

Input:
3

Output:
3 10 5 16 8 4 2 1
link:https://cses.fi/problemset/task/1068
*/
import java.math.BigInteger;
import java.util.*;
public class TapasSahu_WeirdAlgorithm{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		BigInteger n=new BigInteger(sc.nextLine());
		BigInteger n1=new BigInteger("1"),k=new BigInteger("2"),m=new BigInteger("3"),m1=new BigInteger("0");
		while(n.compareTo(n1)==1)
		{
			System.out.print(n+" ");
			if(n.remainder(k).equals(m1))
				n=n.divide(k);
			else
				n=(n.multiply(m)).add(n1);
		}
		System.out.println("1");
	}
 
}
//author:Tapas Sahu
//profile:https://cses.fi/problemset/task/1068