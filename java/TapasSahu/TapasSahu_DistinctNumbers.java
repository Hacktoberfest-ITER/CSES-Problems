/*You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

Input

The first input line has an integer n: the number of values.

The second line has n integers x1,x2,…,xn.

Output

Print one integers: the number of distinct values.

Constraints
1≤n≤2⋅105
1≤xi≤109
Example

Input:
5
2 3 2 2 3

Output:
2
link:https://cses.fi/problemset/task/1621*/
import java.math.BigInteger;
import java.util.*;
public class TapasSahu_DistinctNumbers{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		BigInteger n=new BigInteger(sc.nextLine());
		String x=sc.nextLine();
		String arr[]=x.split(" ");
	    HashSet<String> set=new HashSet(Arrays.asList(arr));
	    System.out.println(set.size());
	  	}
 
}
//author:Tapas Sahu
//Profile: https://cses.fi/problemset/task/1621