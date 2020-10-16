//Your task is to calculate the number of trailing zeros in the factorial n!.
//
//For example, 20!=2432902008176640000 and it has 4 trailing zeros.
//https://cses.fi/problemset/task/1618
import java.util.Scanner;
public class UtkarshShankar_TrailingZeors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int c = 0,i=0;
        for (i=5;n/i>=1; i*= 5) {
            c+=n/i;
        }
        System.out.println(c);
    }

}

//author : Utkarsh Shankar
//profile: https://cses.fi/user/32339