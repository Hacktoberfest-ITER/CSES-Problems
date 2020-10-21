//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
//question link:https://cses.fi/problemset/task/1083
import java.util.*;
		public class RIJULDAS_missing_number {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				       Scanner sc = new Scanner(System.in);
				       long n = sc.nextLong();
				       long sum =0;
				       for(int i =0;i<n-1;i++){
				           int a = sc.nextInt();
				sum+=a;
				       }
				       System.out.println(((n)*(n+1)/2)-sum);
				   sc.close();
			}

		}

//author: RijulDas
//result link:https://cses.fi/problemset/view/1083/
//user id: https://cses.fi/user/32349
