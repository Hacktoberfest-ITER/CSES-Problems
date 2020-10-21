
/*
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

*/
// link : https://cses.fi/problemset/task/1083

#include<iostream>
using namespace std;

 int main()
 {

    int n;
    cin>>n;
    int arr[n];
    int sum=0;
    int arsum=0;
    for(int i=0;i<n-1;i++)
    {
        int num;
        cin>>num;
        arr[i]=num;
        arsum+=num;
    }
    for(int i=1;i<=n;i++)
        sum+=i;

     cout<<sum-arsum;

 }

 //author  : Ayushsahoo
 //profile : https://cses.fi/user/32495
