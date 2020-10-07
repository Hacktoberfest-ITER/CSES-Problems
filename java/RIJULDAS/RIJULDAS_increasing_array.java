//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
//question link:https://cses.fi/problemset/task/1094/
import java.util.*;  
public class RIJULDAS_increasing_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		long c = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                c =c+ a[i - 1] - a[i];
                a[i] = a[i - 1];
            }
        }
        System.out.println(c);
        sc.close();
	}
}


//author: RijulDas
//result link:https://cses.fi/problemset/result/1086952/
//user id: https://cses.fi/user/32349
