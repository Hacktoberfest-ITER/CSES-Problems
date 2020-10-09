import java.util.*;
/*
  Consider an algorithm that takes as input a positive integer n. 
  If n is even, the algorithm divides it by two, and if n is odd, 
  the algorithm multiplies it by three and adds one. 
  The algorithm repeats this, until n is one.
   For example, the sequence for n=3 is as follows:
		3→10→5→16→8→4→2→1


  https://cses.fi/problemset/task/1068
*/
public class WeirdAlgo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		System.out.print(a+" ");
		while(a > 1)
		{
			if(a%2 == 0)
			{
				a = a/2;
				System.out.print(a+" ");
			}
			else 
			{
				a = (a*3)+1;
				System.out.print(a+" ");
			}
		}
	}
}
/*author:swetamukherjee
https://cses.fi/user/32972
*/