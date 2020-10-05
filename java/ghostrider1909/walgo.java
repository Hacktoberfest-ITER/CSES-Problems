/*
  Consider an algorithm that takes as input a positive integer n.
   If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. 
   The algorithm repeats this, until n is one. 

Your task is to simulate the execution of the algorithm for a given value of n.

Input

The only input line contains an integer n.

Input:
3

Output:
3 10 5 16 8 4 2 1

link : https://cses.fi/problemset/task/1068
	*/
import java.util.*;
public class walgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
long n=vk.nextLong();
System.out.print(n+" ");
while(n!=1)
{
	if(n%2==0)
		{
		n/=2;
		System.out.print(n+" ");
		}
	else
	{
		n=n*3+1;
		System.out.print(n+" ");
	}
}
	}

}

/*
 * Author: Vishal Kumar Bellam
 * Github username: ghostrider1909
 * cses profile link : https://cses.fi/user/32706
 */
 
