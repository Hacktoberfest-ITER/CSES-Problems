import java .util.*;
public class missingnumber 
{
	public static void main(String args[])
	{   Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int aa[]=new int[n+1];
		for(int i=0;i<n-1;i++)
		{
			int a=sc.nextInt();
			aa[a]++;
		}
		for(int i=1;i<=n;i++)
		{
			if(aa[i]==0)
				System.out.print(i+" ");
		}
		
	}

}
