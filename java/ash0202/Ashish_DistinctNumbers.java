	/*
 * You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

Input

The first input line has an integer n: the number of values.

The second line has n integers x1,x2,…,xn.

Output

Print one integers: the number of distinct values.

Constraints
1≤n≤2⋅105
1≤xi≤109
Example

Input:
5
2 3 2 2 3

Output:
2

link-https://cses.fi/problemset/task/1621
Author-Ashish Senapati
profile-https://cses.fi/user/32749
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Ashish_DistinctNumbers 
{
static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		String n=sc.nextLine();
		String s=sc.nextLine();
		String []arr=s.split(" ");
		HashSet <String> set = new HashSet<String>(Arrays.asList(arr));
		System.out.println(set.size());

	}

}
