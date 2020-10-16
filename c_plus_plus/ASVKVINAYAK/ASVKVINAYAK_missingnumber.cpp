/*
Missing Number
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
 Question link : https://cses.fi/problemset/task/1083/
 Profile Link :https://cses.fi/user/32376 
 Author: ASVKVINAYAK
*/

#include<iostream>
using namespace std;
int main()
{
	long long int s=0,n,a;
	cin>>n;
	s=(n*(n+1))/2;
	int i;
	for(i=1;i<=n-1;++i)
	{
		cin>>a;
		s=s-a;
	}
	cout<<s<<endl;
	return 0;
}
