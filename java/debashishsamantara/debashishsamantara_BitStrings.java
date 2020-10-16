//Author : debashishsamantara
//Profile : https://cses.fi/user/32389
//Your task is to calculate the number of bit strings of length n.For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.
//Ques .link : https://cses.fi/problemset/task/1617


import java.util.Scanner;
public class debashishsamantara_BitStrings {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int  k = 1;
        int n = sc.nextInt();
        for(int i=n; i>0; i--)
        {
            k = (k*2)%mod;
        }
        System.out.println(k);
        sc.close();
   } 
}
