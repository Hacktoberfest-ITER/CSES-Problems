/*Your task is to calculate the number of trailing zeros in the factorial n!.
For example, 20!=2432902008176640000 and it has 4 trailing zeros.*/
// https://cses.fi/problemset/task/1618/
import java.util.Scanner;
public class Test14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>=5){
            c+=(n/=5);
        }
        System.out.println(c);
    }
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401