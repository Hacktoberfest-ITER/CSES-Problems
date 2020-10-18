//  problem:Bit_Stirng
//  link: https://cses.fi/problemset/task/1617
//  author: saurabh_nikam
//  profile: https://cses.fi/user/32649 


#include<iostream>
#include<bits/stdc++.h>
using namespace std;
 #define ios  ios::sync_with_stdio(false);cin.tie(NULL)
 #define endl  "\n"
 #define ll long long  
 const long Mod=1e9+7;
 
 void solve()
 {
     ll n;
     cin>>n;
     ll ans=1;
     for(int i=0;i<n;i++)
     ans=2*ans%(int(Mod));
     cout<<ans<<endl;
 } 
int  main()
{
    ios;
    int tt=1;
   // cin>>tt;
    while(tt--)
    {
        solve();
    }
    return 0;
}


//author:saurabh_nikam