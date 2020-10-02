import java.util.Scanner;

public class kejariwalAyush_TrailingZerors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int cnt = 0;
        for (int i = 5; i <= n; i *= 5) {
            cnt += n / i;
        }
        System.out.println(cnt);
    }

}
