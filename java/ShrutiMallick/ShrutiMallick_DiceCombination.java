/*Your task is to count the number of ways to construct sum n by throwing a dice one or more times.
 Each throw produces an outcome between 1 and 6.
 link: https://cses.fi/problemset/task/1633/
 */
import java.util.*;
public class DiceCombination {
	static final int MD=1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n+1];
		a[0]=1;
		for(int i=1;i<=n;i++) {
			long x=0;
			for(int j=i-1;j>=i-6 && j>=0;j--) {
				x+=a[j];
			}a[i]=(int)(x % MD);
		}
		System.out.println(a[n]);
	}
}

//author:Shruti
//profile link:https://cses.fi/user/32358