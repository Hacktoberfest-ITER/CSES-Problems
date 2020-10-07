// You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
// https://cses.fi/problemset/task/1069/
import java.util.Scanner;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int r=1,c=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            if(r<c){
                r=c;
            }
        }
        System.out.println(r);
    }
}
// author: rituraj-iter
// profile: https://cses.fi/user/32401