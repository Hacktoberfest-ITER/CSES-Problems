// Your task is to count for k=1,2,…,n the number of ways two knights can be placed on a k×k chessboard so that they do not attack each other.
// https://cses.fi/problemset/task/1072
import java.util.Scanner;
public class Test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            int k =i*i;
            System.out.println((long)k*(k-1)/2-(i-1)*(i-2)*4);
        }
    }
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401