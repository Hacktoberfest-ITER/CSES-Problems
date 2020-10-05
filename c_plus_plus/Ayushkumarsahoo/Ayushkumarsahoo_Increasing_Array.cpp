/*
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

*/
// link : https://cses.fi/problemset/task/1094

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

 int main()
 {

  int n;
  cin>>n;
  long long arr[n];
  long long c=0;
  for(int i=0;i<n;i++)
  {
      long long num;
      cin>>num;
      arr[i]=num;
  }
  for(int i=1;i<n;i++)
  {
      if(arr[i]<arr[i-1])
      {
         long long t=arr[i-1]-arr[i];
         c+=t;
         arr[i]=arr[i-1];
      }
  }
  cout<<c;

 }

 //author  : Ayushsahoo
 //profile : https://cses.fi/user/32495
