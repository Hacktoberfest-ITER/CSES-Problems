/*Given an array of n integers, 
 * your task is to find for each array position the nearest position to its left having a smaller value.
 * 
 * link:https://cses.fi/problemset/task/1645
 */
import java.util.*;
import java.io.*;
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);		
		int n=sc.nextInt();
		int []a=new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		int stack[]=new int[n+1];
		int count=0;
		stack[count++]=0;
		for(int i=1;i<=n;i++) {
			int h=0;
			while(a[h=stack[count-1]]>=a[i]) {
				count--;
			}
			pw.print(h+" ");
			stack[count++]=i;
		}
		pw.println();
		pw.close();
	}

}
//author:Shruti
//profile link:https://cses.fi/user/32358
