
//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

//author:AbHiSHekAB01;

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

 int main()
 {

  int n;
  cin>>n;
  long long arr[n];
  long long x=0;
  for(int i=0;i<n;i++)
  {
     cin>>arr[i];
  }
  for(int i=1;i<n;i++)
  {
      if(arr[i]<arr[i-1])
      {
         long long num=arr[i-1]-arr[i];
         x=x+num;
         arr[i]=arr[i-1];
      }
  }
  cout<<x;

 
 }

 //cses uid: https://cses.fi/user/32825