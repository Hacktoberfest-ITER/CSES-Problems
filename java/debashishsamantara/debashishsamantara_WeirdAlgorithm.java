/*Consider an algorithm that takes as input a positive integer n. If n is
even, the algorithm divides it by two, and if n is odd, the algorithm
multiplies it by three and adds one. The algorithm repeats this, until n is
one. For example, the sequence for n=3 is as follows: 3→10→5→16→8→4→2→1*/

//Author : debashishsamantara
//Ques. link : https://cses.fi/problemset/task/1068/
//Solution : https://cses.fi/problemset/result/1069935/
//Profile : https://cses.fi/user/32389

import java.util.Scanner;
public class debashishsamantara_WeirdAlgorithm
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long x = sc.nextInt();
        if(x==1)
        {
            System.out.print(x);
            System.exit(0);
        }
        while(x>0)
        {
            System.out.print(x+" ");
            if(x%2==0)
            {
                x/=2;
            }
            else{
                x*=3;
                ++x;
            }
            if(x==1)
                break;
        }
        System.out.print("1");
    }
}
