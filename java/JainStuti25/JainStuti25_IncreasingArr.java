// AUTHOR
// Stuti Jain
// USER ID
// https://cses.fi/user/25504
// PROBLEM NUMBER
// https://cses.fi/problemset/task/1094
// You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

public class JainStuti25_IncreasingArr {
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
