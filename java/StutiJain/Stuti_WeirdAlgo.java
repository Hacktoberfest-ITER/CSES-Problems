// AUTHOR
// Stuti Jain
// USER ID
// https://cses.fi/user/25504
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1068
// Weird Algorithm

public class Stuti_WeirdAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        System.out.print(a+" ");
        while (a != 1) {
            if (a % 2 == 0) {
                a=a/2;
                System.out.print(a+" ");
            }

            else{
                a=(a*3)+1;
                System.out.print(a+" ");
            }
        }
    }
}
