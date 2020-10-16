/*
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

Input

The first input line contains an integer n.

The second line contains n−1 numbers. Each number is distinct and between 1 and n (inclusive).

Output

Print the missing number.

Constraints
2≤n≤2⋅105
Example

Input:
5
2 3 1 5

Output:
4
link:https://cses.fi/problemset/task/1083
*/
import java.math.BigInteger;
import java.util.*;
public class TapasSahu_MissingNumber{
static Scanner sc=new Scanner(System.in);
static BigInteger sum=new BigInteger("0");
	public static void main(String[] args) 
	{
		BigInteger k=new BigInteger(sc.nextLine());
		String x=sc.nextLine();
		String arr[]=x.split(" ");
		for(String ar:arr)
		sum=sum.add(BigInteger.valueOf(Integer.valueOf(ar)));
		System.out.println((k.multiply(k.add(new BigInteger("1"))).divide(new BigInteger("2"))).subtract(sum));
		}
 
}
//author:Tapas Sahu
//profile:https://cses.fi/problemset/task/1083