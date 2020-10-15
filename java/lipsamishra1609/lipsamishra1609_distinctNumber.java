/*
 You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
 Input
 The first input line has an integer n: the number of values.
 The second line has n integers x1,x2,…,xn.
 Output
 Print one integers: the number of distinct values.

 link : https://cses.fi/problemset/task/1621
 author: Lipsa Mishra
 profile: https://cses.fi/user/32829
 */
import java.util.HashSet;
import java.util.Scanner;
public class lipsamishra1609_distinctNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        HashSet <Integer> mySet = new HashSet<>();
	        for (int i = 0; i < n; ++i) {
	            mySet.add(sc.nextInt());
	        }
	        System.out.println(mySet.size());
	}


}
