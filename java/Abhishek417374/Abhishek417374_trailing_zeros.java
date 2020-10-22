//Your task is to calculate the number of trailing zeros in the factorial n!.For example, 20!=2432902008176640000 and it has 4 trailing zeros.

///https://cses.fi/problemset/task/1618

//Author:Abhishek417374

import java.util.Scanner;
public class Abhishek417374_trailing_zeros{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for (int i = 5; i <= n; i *= 5) 
            count += n / i;
        System.out.println(count);

	}

}
