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