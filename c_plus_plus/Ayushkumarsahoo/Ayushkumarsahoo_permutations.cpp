
/*
A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.

Given n, construct a beautiful permutation if such a permutation exists.
*/
// link : https://cses.fi/problemset/task/1070

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

 int main()
 {

  int n;
  cin>>n;
  if(n==1)
    cout<<1;
  else if(n<4)
    cout << "NO SOLUTION";
  else if(n==4)
    cout<<"3 1 4 2";
  else
  {
    for (int i = 1; i <= n; i += 2)
        {
            cout << i << " ";
        }
      for (int i = 2; i <= n; i += 2)
        {
            cout << i << " ";
        }
  }

 }

 //author  : Ayushsahoo
 //profile : https://cses.fi/user/32495
