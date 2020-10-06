/*
Your task is to calculate the number of trailing zeros in the factorial n!.

For example, 20!=2432902008176640000 and it has 4 trailing zeros.

Input

The only input line has an integer n.

Output

Print the number of trailing zeros in n!.

Constraints
1≤n≤109
Example

Input:
20

Output:
4
link:https://cses.fi/problemset/task/1618
*/
import java.io.*;
import java.math.BigInteger;
import java.util.Scanner; 
public class TapasSahu_TrailingZeros
{ 
	static Scanner sc=new Scanner(System.in);
	static BigInteger findTrailingZeros(BigInteger n) 
	{  
		BigInteger count=new BigInteger("0");
		BigInteger i=new BigInteger("5");
		BigInteger j=new BigInteger("5");
		BigInteger m1=new BigInteger("1");
		for (; n.divide(i).compareTo(m1)==1||n.divide(i).compareTo(m1)==0; i=i.multiply(j)) 
			count =count.add(n.divide(i)); 
		return count; 
	}  
	public static void main (String[] args) 
	{ 
		BigInteger n=new BigInteger(sc.nextLine());
		System.out.println(findTrailingZeros(n)); 
	} 
}
//author:Tapas Sahu
//profile:https://cses.fi/problemset/task/1618  