// You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
// https://cses.fi/problemset/task/1621/
import java.util.*;
public class Test2 {
	public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for (int i = 0; i < n; i++)
	            arr[i] =sc.nextInt();
	        Arrays.sort(arr);
	        int c = 1;
	        for (int i = 1; i < n; i++)
	            if ((int) arr[i]!=arr[i - 1])
	                c++;
	        System.out.println(c);
	}
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401