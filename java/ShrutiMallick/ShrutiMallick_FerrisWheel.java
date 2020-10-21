/*There are n children who want to go to a Ferris wheel, and your task is to find a gondola for each child.

Each gondola may have one or two children in it, and in addition, the total weight in a gondola may not exceed x. You know the weight of every child.

What is the minimum number of gondolas needed for the children?

link:https://cses.fi/problemset/task/1090
*/
import java.util.*;
public class FerrisWheel {	
		static Random rand=new Random();
		private static void shuffle(int []a,int n){
			for(int i=1;i<n;i++) {
				int j=rand.nextInt(i+1);
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		shuffle(a,n);
		Arrays.sort(a);		
		int ans=n;
		for(int i=0,j=n-1;i<j;i++) {
			while(i<j && a[i]+a[j]>x) {
				j--;
				}
				if(i<j) {
					j--;
					ans--;
				}
			}		
		System.out.println(ans);
	}
}
//author:Shruti
//profile link:https://cses.fi/user/32358
