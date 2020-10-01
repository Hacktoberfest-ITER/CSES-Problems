/*Given an array of n integers, your task is to count 
 * the number of subarrays where the sum of values is divisible by n.
 link:https://cses.fi/problemset/task/1662
 */
import java.util.*;
public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		a[0]=1;		
		for(int i=0,s=0;i<n;i++) {			
			s+=sc.nextInt();
			s%=n;
			if(s<0) {
				s+=n;
			}a[s]++;
			
			}
		long p=0;
		for(int s=0;s<n;s++) {
			int k=a[s];
			p+=(long)k*(k-1)/2;
			
		}System.out.println(p);

	}

}
//author:Shruti
//profile link:https://cses.fi/user/32358

