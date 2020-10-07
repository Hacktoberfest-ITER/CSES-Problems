/*weird algorithm
/cses.fi/problemset/task/1068
*/
import java.util.*;
public class UtkarshShankar_Weird {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		long n=in.nextLong();
		System.out.print(n + " ");
		while (n!=1)
		{
			if(n%2==0)
				n/=2;
			else
				n=(n*3)+1;
			System.out.print(n + " ");
		}
		}

}
//author : Utkarsh Shankar
//profile: https://cses.fi/user/32339