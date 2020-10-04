import java.util.*;
public class walgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
long n=vk.nextLong();
System.out.print(n+" ");
while(n!=1)
{
	if(n%2==0)
		{
		n/=2;
		System.out.print(n+" ");
		}
	else
	{
		n=n*3+1;
		System.out.print(n+" ");
	}
}
	}

}
