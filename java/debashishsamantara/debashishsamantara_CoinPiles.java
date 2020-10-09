// You have two coin piles containing a and b coins. On each move, you can either remove one coin from the left pile and two coins from the right pile, or two coins from the left pile and one coin from the right pile.

// Your task is to efficiently find out if you can empty both the piles.

//Author : debashishsamantara
//Profile : https://cses.fi/user/32389

//Ques. link : https://cses.fi/problemset/task/1754/
import java.util.Scanner;
public class debashishsamantara_CoinPiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int y = sc.nextInt();
        for(int i=1; i<=y; i++ )
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b)
            {
                int u;
                u = a;
                a = b;
                b = a;
            }
            String s= "";
            if(2*a<b)
                s = "NO";
            else{
                a%=3;
                b%=3;
                if(a>b){
                    int u;
                    u = a;
                    a = b;
                    b = a;
                }
                if((a==0 && b==0) || (a==1 && b==2))
                    s = "YES";
                else
                    s = "NO";
            }   
            System.out.println(s); 
        }
    }
}
