//Author: agarwalsahil0210

//User id: https://cses.fi/user/32363

//Question link:  https://cses.fi/problemset/task/1068

/*Question: Consider an algorithm that takes as input a positive integer n.
If n is even, the algorithm divides it by two, 
and if n is odd, the algorithm multiplies it by three and adds one.
*/

// Result: https://cses.fi/problemset/result/1067549/

import java.util.*;
public class weird {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n= in.nextInt();
		while(n!=1)
		{
			System.out.print(n+" ");
			long r=n%10;
			if(r%2==0)
				n=n/2;
			else
			{
				n=n*3;
				n=n+1;
			}
		}
		System.out.print(1);

	}

}

