//A permutation of integers 1,2,....,n is called beautiful if there are no adjacent elements whose difference is 1.Given n, construct a beautiful permutation if such a permutation exists.

// Question Link: https://cses.fi/problemset/task/1070

import java.util.Scanner;
public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		s1.close();
		if(n == 3 || n ==2) {
			System.out.println("NO SOLUTION");
		}
		else if(n == 4) {
			System.out.println("2 4 1 3");
		}
		else {
			StringBuilder sb = new StringBuilder();
			for(int i = 1 ; i < n+ 1 ; i+=2) {
				sb.append(i+ " ");
			}for(int i = 2 ; i < n+1 ; i+= 2) {
				sb.append(i + " ");
			}
			System.out.println(sb);
		}
	}
}

//author: SatyapragyanDas
//profile: https://cses.fi/user/32452
