//Weird Algorithm
//Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
// 3→10→5→16→8→4→2→1

//Problem link: https://cses.fi/problemset/task/1068

//UserID: https://cses.fi/user/32264

//Author: Sourav Bera

//Result: https://cses.fi/problemset/result/1065843/
import java.util.*;
public class ZeoShark_Weird_Algorithm{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long n= in.nextInt();
        while(n!=1)
        {
            System.out.print(n+" ");
            if(n%2==0)
                n=n/2;
            else
                n=(n*3)+ 1;
        }
        System.out.println("1");
        in.close();
    }
}