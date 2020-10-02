import java.util.Scanner;
public class amohapatra123_weird_algorithm{

    public static void main(String args[]){
        Scanner y= new Scanner(System.in);
        long n=y.nextLong();
        System.out.print(n+" ");
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }else if(n%2==1){
                n=(n*3)+1;
            }
            System.out.print(n+" ");
        }

    }
}