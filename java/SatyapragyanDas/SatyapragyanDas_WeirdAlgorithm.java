import java.util.Scanner;

public class WeirdAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		long n=s1.nextInt();
		s1.close();
		System.out.println(n);
		while(n>1){
			if(n%2==0){
				n/=2;
				System.out.println(n);
			}
			else{
				n=n*3+1;
				System.out.println(n);
			}
		}
	}
}
