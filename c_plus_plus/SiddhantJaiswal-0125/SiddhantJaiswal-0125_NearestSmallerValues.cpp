/*

Given an array of n integers, your task is to find for each array position the nearest position to its left having a smaller value.

Input

The first input line has an integer n: the size of the array.

The second line has n integers x1,x2,…,xn: the array values.

Output

Print n integers: for each array position the nearest position with a smaller value. If there is no such position, print 0.
*/


//this question  is an application of stack
// problem link : https://cses.fi/problemset/task/1645/




#include<iostream>
#include<string>
#include<vector>
#include<set>
#include<map>
#include<queue>
#include<utility>
#include<iomanip>
#include<algorithm>
#include<cmath>
#include<stack>
#define ll long long
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    
    int n; cin>>n;
        long x[n];

        for(int i = 0; i < n; i++)
        {
            cin>>x[i];
        }
        vector <int> v;
    stack<pair<int, int>>s;

        for (int i = 0; i < n;i++)
        {
            if(s.empty())
            {
                v.push_back(0);
            }
            else if(s.top().first<x[i])
            {
                v.push_back(s.top().second);
            }
            else if(!s.empty() && s.top().first>=x[i] )
            {
                while(!s.empty() && s.top().first>=x[i])
                    s.pop();

                if(s.empty())
                    v.push_back(0);
                else
                    v.push_back(s.top().second);
            }

            s.push({x[i],i+1});
        }


        for (int i = 0;i<n;i++)
            cout<<v[i]<<" ";
       cout<<"\n";
    
}


//author : SiddhantJaiswal
//Solution : https://cses.fi/problemset/result/1068742/
