/*

Apple Division

There are n apples with known weights. Your task is to divide the apples into two groups so that the difference between the weights of the groups is minimal.

Input

The first input line has an integer n: the number of apples.

The next line has n integers p1,p2,…,pn: the weight of each apple.

Output

Print one integer: the minimum difference between the weights of the groups.

Constraints
1≤n≤20
1≤pi≤10^9

 Question link : https://cses.fi/problemset/task/1623

 Profile Link :https://cses.fi/user/32476

 Author: Sudeep Swain(https://github.com/Sudeep25022000)

*/
#include<iostream>
#include <bits/stdc++.h>
using namespace std;
 
int main()
{
	long long int n, total=0, min_diff=INT_MAX;
	cin >> n;
	long long int arr[n];
	for(long long int i = 0; i < n; i++) {
		cin >> arr[i];
		total += arr[i];
	}
	for(long long int i = 0; i < 1<<n; i++) {
		long long int s = 0;
		for(long long int j = 0; j < n; j++) {
			if(i & 1<<j) s += arr[j];
		}
		long long int c = abs((total-s)-s);
		min_diff = min(min_diff, c);
	}
	cout << min_diff;
	return 0;
}
