/*
Repetitions

You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

 Question link : https://cses.fi/problemset/task/1069
 Profile Link :https://cses.fi/user/32376 
 Author: ASVKVINAYAK

*/

#include <bits/stdc++.h>
using namespace std;
int main()
{
	string ss;
	cin >> ss;
	long long int c=1,i,s=0;
	for ( i=0;i<ss.length()-1;++i)
	{
		s=1;
		while (ss[i]==ss[i+1])
		{
			
			s++;
			i++;
		}
		if (s>c)
		{
			c=s;
		}
	}
	cout <<c<<endl;
	return 0;
}

