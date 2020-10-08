
/*You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

Input

The first input line contains an integer n.

The second line contains n−1 numbers. Each number is distinct and between 1 and n (inclusive).

Output

Print the missing number.

Constraints5
2≤n≤2⋅105
Example

Input:
5
2 3 1 5

Output:
4*/



import java.util.Arrays;
import java.util.Scanner;
public class Abhishek417374_missing_number{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n=s.nextInt();
		int a[]=new int[n-1];
		for(i=0;i<(n-1);i++) {
			a[i]=s.nextInt();
		}
		int find=1;
		for(int j=2;j<=n;j++)
			find+=j-a[j-2];
		System.out.println(find);
		

	}

}
