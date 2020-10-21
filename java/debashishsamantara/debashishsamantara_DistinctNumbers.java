// You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
//Author : debashishsamantara
//Profile : https://cses.fi/user/32389
//Ques. link : https://cses.fi/problemset/task/1621/

import java.util.*;
public class debashishsamantara_DistinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int c = 1;
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i]!=a[i+1])
            {
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
