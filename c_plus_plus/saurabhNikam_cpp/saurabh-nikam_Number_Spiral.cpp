//  problem:Number_spiral
//  link: https://cses.fi/problemset/task/1071
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
     ll x,y;ll ans;
     cin>>x>>y;
     if(x>=y)
     {
         if(x%2==0)
         {
             ans=x*x-(y-1);
         }
         else
         {
             ans=(x-1)*(x-1)+y;
         }   
     }else
     {
         if(y%2!=0)
         {
             ans=y*y-(x-1);
         }else
         {
             ans=(y-1)*(y-1)+x;
         }    
     }
     cout<<ans<<endl;
     
 } 
int  main()
{
    ios;
    int tt=1;
    cin>>tt;
    while(tt--)
    {
        solve();
    }
    return 0;
}

//author:saurabh-nikam