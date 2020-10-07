/*You are given an array of n integers, and your task is to find two values (at distinct positions) whose sum is x.*/
//Link---> https://cses.fi/problemset/task/1640


import java.util.*;


class SumOfTwoValues{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
         for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
           
        }

     Set<Integer> set=new HashSet<>();
        boolean pos=false;
        int first=0;
        int sec=0;
        for(int i=0;i<n;i++){
            if(set.contains(x-a[i])){
                sec=i;
                pos=true;
                break;
            }
            else
            set.add(a[i]);
        }
        int v=x-a[sec];
        for(int i=0;i<n;i++){
            if(a[i]==v){
                first=i;
                break;
            }
        }
        
        if(pos==true){
            System.out.println(first+1+" "+(sec+1));
        }else
        System.out.println("IMPOSSIBLE");
        sc.close();

    }
}
//author:Rishika
//profile-->https://cses.fi/user/32327
