//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?


//Link : https://cses.fi/problemset/task/1094/

#include <iostream>

using namespace std;

int main()
{
    int n;
  cin>>n;
  long long a[n];
  long long ctr=0;
  for(int i=0;i<n;i++)
  {
      long long num;
      cin>>num;
      a[i]=num;
  }
  for(int i=1;i<n;i++)
  {
      if(a[i]<a[i-1])
      {
         long long turns=a[i-1]-a[i];
         ctr+=turns;
         a[i]=a[i-1];
      }
  }
  cout<<ctr;

    return 0;
}

//Author : SouravReal a.k.a Sourav_K_P
//Profile: https://cses.fi/user/32489
//Result : https://cses.fi/problemset/result/1109547/
