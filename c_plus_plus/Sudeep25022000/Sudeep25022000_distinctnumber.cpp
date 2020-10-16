/*

Distinct Numbers

Time limit: 1.00 s Memory limit: 512 MB
You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

Input

The first input line has an integer n: the number of values.

The second line has n integers x1,x2,…,xn.

Output

Print one integers: the number of distinct values.

Constraints
1≤n≤2⋅10^5
1≤xi≤10^9

 Question link : https://cses.fi/problemset/task/1621

 Profile Link :https://cses.fi/user/32476

 Author: Sudeep Swain(https://github.com/Sudeep25022000)

*/
#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, ele;
    cin >> n;
    set<int> distinctnumber;
    for (int i = 0; i < n; i++)
    {
        cin >> ele;
        distinctnumber.insert(ele);
    }
    cout << distinctnumber.size();
    return 0;
}
