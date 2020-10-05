import java.math.BigInteger;
import java.util.*;
public class WeirdAlgorithm{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		BigInteger n=new BigInteger(sc.nextLine());
		BigInteger n1=new BigInteger("1"),k=new BigInteger("2"),m=new BigInteger("3"),m1=new BigInteger("0");
		while(n.compareTo(n1)==1)
		{
			System.out.print(n+" ");
			if(n.remainder(k).equals(m1))
				n=n.divide(k);
			else
				n=(n.multiply(m)).add(n1);
		}
		System.out.println("1");
	}
 
}