//You are given all numbers between 1,2,…,n except one.
//Your task is to find the missing number.

//Link:https://cses.fi/problemset/task/1083/
//Example

/*Input:
5
2 3 1 5

Output:
4*/
import java.util.Scanner;
public class Raviruler_Missing_Number {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int b=1,n;
			n=scan.nextInt();
			int a[]=new int[n-1];
			for(int i=0;i<n-1;i++) {
				a[i]=scan.nextInt();
			}
			for(int j=2;j<=n;j++)
				b+=j-a[j-2];
			System.out.print(b);
		}

	}
//Author: Ravi Kumar Prasad
//Git_hub Id: Raviruler
//cses : https://cses.fi/user/32356/