//Your task is to calculate the number of trailing zeros in the factorial n!.

//For example, 20!=2432902008176640000 and it has 4 trailing zeros.
//question link:https://cses.fi/problemset/task/1618/
import java.util.*;
public class RIJULDAS_trailing_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=0;
		while(n>=5)
		{
			n=n/5;
			l=l+n;
		}
	   		System.out.println(l);
		sc.close();
	}
}


//author: RijulDas
//result link:https://cses.fi/problemset/result/1082987/
//user id: https://cses.fi/user/32349
