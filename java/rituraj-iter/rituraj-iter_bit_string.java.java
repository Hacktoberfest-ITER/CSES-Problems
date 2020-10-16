// Your task is to calculate the number of bit strings of length n.
// https://cses.fi/problemset/task/1617/
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        final int m_mod=1000000007;
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        while(n-->0){
            i=(i*2)%m_mod;
        }
        System.out.println(i);
    }
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401