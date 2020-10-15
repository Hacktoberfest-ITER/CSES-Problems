/*
Your task is to calculate the number of trailing zeros in the factorial n!.

For example, 20!=2432902008176640000 and it has 4 trailing zeros.

https://cses.fi/problemset/task/1618/
*/



import java.util.*;

public class TrailingZeros
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    	int total = 0;
    	for (int i = 5; n / i >= 1; i *= 5)
    	{
        	total += n / i;
    	}
    	System.out.println(total);
	}
}


/*author: swetamukherjee
https://cses.fi/user/32972
*/