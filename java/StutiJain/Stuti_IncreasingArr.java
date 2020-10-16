// AUTHOR
// Stuti Jain
// USER ID
// https://cses.fi/user/25504
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1094
// Increasing Array

public class Stuti_IncreasingArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                ans=ans+(arr[i]-arr[i+1]);
                arr[i+1]=arr[i];

            }
        }

        System.out.print(ans);
    }
}
