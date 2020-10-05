//Consider an algorithm that takes as input a positive integer n. 
//If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, 
//until n is one. For example, the sequence for n=3 is as follows:
//3→10→5→16→8→4→2→1
//Your task is to simulate the execution of the algorithm for a given value of n.

//question link: https://cses.fi/problemset/task/1068
import java.util.*;
public class RIJULDAS_weird_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	long n=sc.nextLong();
		while(n!=1)
		{
			System.out.print(n+" ");
			if(n%2==0)
			{
				n=n/2;
				
			}
			else
			{
				n=n*3;
				n=n+1;
				
			}
		}
		System.out.println(1);
		sc.close();
	}
}

//author: RijulDas
//result link: https://cses.fi/problemset/result/1071090/
//user id: https://cses.fi/user/32349
