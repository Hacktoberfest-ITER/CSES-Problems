/*
Bit Strings

Your task is to calculate the number of bit strings of length n.

For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.

 Question link : https://cses.fi/problemset/task/1617
 Profile Link :https://cses.fi/user/32376 
 Author: ASVKVINAYAK

*/


#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
	long long int n,s=1,i;
	cin>>n;
    for(i=1;i<=n;++i)
    {
        s= (s*2)%1000000007;
    }
    cout<<s<<endl;
	return 0;
}
