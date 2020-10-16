/*
Two Knights

Your task is to count for k=1,2,…,n the number of ways two knights can be placed on a k×k chessboard so that they do not attack each other.

 Question link : https://cses.fi/problemset/task/1072/
 Profile Link :https://cses.fi/user/32376 
 Author: ASVKVINAYAK

*/
include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  long long int n,i,s=0;
  cin>>n;
  for(i=1;i<=n;++i)
  {
     s=(((i*i)*((i*i)-1))/2) -(4*((i-1)*(i-2)));
     cout<<s<<endl;
   }	
	
	
	return 0;

}
