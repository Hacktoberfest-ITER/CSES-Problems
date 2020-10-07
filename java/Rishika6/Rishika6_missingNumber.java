/*You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
 Link--> https://cses.fi/problemset/task/1083*/
import java.util.Scanner;

public class MissingNumber {
 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n-1];
	int xor=0;
	
	for(int i=0;i<n-1;i++) {
		a[i]=sc.nextInt();
		xor^=a[i];
	}
	for(int i=1;i<=n;i++) {
		xor=xor^i;
	}
	
	System.out.println(xor);
}
	
} 
//author:Rishika
//https://cses.fi/user/32327