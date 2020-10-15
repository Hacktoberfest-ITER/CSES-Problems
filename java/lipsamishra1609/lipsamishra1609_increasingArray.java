/*
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
Input
The first input line contains an integer n: the size of the array.
Then, the second line contains n integers x1,x2,…,xn: the contents of the array.
Output
Print the minimum number of turns.

link: https://cses.fi/problemset/task/1094/
author: Lipsa Mishra
profile: https://cses.fi/user/32829
 */
import java.util.Scanner;
public class lipsamishra1609_increasingArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long count = 0;
        for (int i=0;i<n;++i)
        {
            arr[i]=sc.nextInt();
        }
        for (int j=1;j<n;++j)
        {
            if (arr[j]<arr[j-1]) 
            {
                count = count+(arr[j-1]-arr[j]);
                arr[j]=arr[j-1];
            }
        }
        System.out.println(count);

	}

}
