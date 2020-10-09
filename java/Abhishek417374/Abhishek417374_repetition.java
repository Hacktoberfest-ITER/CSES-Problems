import java.util.Scanner;
public class Abhishek417374_repetition{

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		String s=S.next().toUpperCase();
		int count=1,max=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i))
				count=count+1;
			else
				count=1;
			max=Math.max(count,max);
		}
		System.out.println(max);

	}

}
