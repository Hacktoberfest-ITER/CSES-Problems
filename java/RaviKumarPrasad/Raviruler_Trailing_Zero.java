/*Your task is to calculate the number of trailing zeros in the factorial n!.

For example, 20!=2432902008176640000 and it has 4 trailing zeros.

link : https://cses.fi/problemset/task/1618/
*/
import java.util.Scanner;
public class Raviruler_Trailing_Zero {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,zeroes=0,b;
		int count=0;
		n=scan.nextInt();
		for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i; 
		}
		System.out.print(count);
	}
	
}
//Author: Ravi Kumar Prasad
//Git_hub Id: Raviruler
//cses : https://cses.fi/user/32356/