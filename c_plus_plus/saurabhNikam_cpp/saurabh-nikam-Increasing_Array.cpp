//  problem:Increasing_Array
//  link: https://cses.fi/problemset/task/1094
//  author: saurabh_nikam
//  profile: https://cses.fi/user/32649

#include<iostream>
#include<bits/stdc++.h>
using namespace std;
 #define ios  ios::sync_with_stdio(false);cin.tie(NULL)
 #define endl  "\n"
 #define ll long long  
 
 void solve()
 {
     int n;
     cin>>n;
     ll a[n];
     for (int i=0;i<n;i++)
     {
         cin>>a[i];
     }
     ll count=0;
     ll max=a[0];
     for(int i=1;i<n;i++)
     {
         if(max<a[i])
         {
             max=a[i];
         }
         else
         {
             count=count+max-a[i];
         }
             
     }
     cout<<count<<endl;
 } 
int  main()
{
    ios;
    int tt; //
    tt=1;
    //cin>>tt;
 
    while(tt--)
    {
        solve();
    }
    return 0;
}

//author:saurabhnikam