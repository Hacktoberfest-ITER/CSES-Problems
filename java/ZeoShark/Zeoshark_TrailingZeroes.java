//Trailing Zeroes
//Your task is to calculate the number of trailing zeros in the factorial n!.
//
// For example, 20!=2432902008176640000 and it has 4 trailing zeros.
//Problem Link:https://cses.fi/problemset/task/1618

//Result: https://cses.fi/problemset/result/1072678/
//Author: souravbera
import java.util.*;
public class Zeoshark_TrailingZeroes {
   public static void main(String[] args) {
       
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    //Initialising count
    //trailing Zeroes
    int count=0;

    // Keep dividing n by powers of 5
    for(int i=5;n/i>=1;i*=5)
    {
        count += n / i;
    }
    System.out.println(count);

   }
}
