//Your task is to calculate the number of trailing zeros in the factorial n!.
//For example, 20!=2432902008176640000 and it has 4 trailing zeros.

//Author : debashishsamantara
//Profile : https://cses.fi/user/32389
//Ques. link : https://cses.fi/problemset/task/1618


import java.util.Scanner;
public class debashishsamantara_TrailingZeros {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=5; x/i>=1; i*=5)
        {
            c+=x/i;
        }
        System.out.println(c);
        sc.close();
    }
}
