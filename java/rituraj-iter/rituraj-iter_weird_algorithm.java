import java.io.*;
public class weird_algorithm{
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n != 1) {
            sb.append(n + " ");
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
        }
        sb.append(1);
        System.out.println(sb);
	}
}