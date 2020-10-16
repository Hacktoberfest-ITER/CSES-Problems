// AUTHOR
// Stuti Jain
// USER ID
// https://cses.fi/user/25504
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1083
// You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

public class JainStuti25_MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum=0;

        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            sum+=a;
        }


        System.out.print(n*(n+1)/2-sum);

    }
}
