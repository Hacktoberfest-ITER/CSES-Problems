//  problem:Repatations
//  link: https://cses.fi/problemset/task/1069
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
     string s;
     cin>>s;
     int ans=0;
     int count=1;
     for(int i=0;i<s.size();i++)
     {
         if(s[i]==s[i+1])
         count++;
         else
         {
             count=1;
         }
         if(ans<count)
         {
             ans=count;
         }
         
     }
     cout<<ans<<endl;
 } 
int  main()
{
    ios;
    int tt; //
    tt=1;
   // cin>>tt;
 
    while(tt--)
    {
        solve();
    }
    return 0;
}

//author:saurbhnikam