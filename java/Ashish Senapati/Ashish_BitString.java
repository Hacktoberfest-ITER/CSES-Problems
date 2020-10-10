import java.math.BigInteger;
import java.util.Scanner;

public class Ashish_BitString {
static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int s = sc.nextInt();
		BigInteger two = new BigInteger("2");
		BigInteger  res = two.pow(s);
		System.out.println(res.mod(new BigInteger("1000000007")));
		
		
	}

}
