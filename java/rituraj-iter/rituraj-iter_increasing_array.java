// You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
// On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
// https://cses.fi/problemset/task/1094/
import java.util.Scanner;
public class Increasing_Array {
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		long c=0;
		for(int i=1;i<n;i++){
			int b=sc.nextInt();
			a=Math.max(a, b);
			c+=a-b;
		}
		System.out.println(c);
    }
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401