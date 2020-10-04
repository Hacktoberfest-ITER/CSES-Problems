


//Your task is to count for k=1,2,…,n the number of ways two knights can be placed on a
//k×k chessboard so that they do not attack each other

//author:ankitsaebby

import java.util.*;
public class ankitsaebby_two_knights {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		int n =s.nextInt();
		for(int i=1;i<=n;i++) {
			int w=ways(i);
			System.out.println(w);
		}

	}
	public static int ways(int n) {
		int s1=n*n*(n*n-1)/2;
		int s2=4*(n-1)*(n-2);
		return s1-s2;
	}

}

// cses id- https://cses.fi/user/32538
