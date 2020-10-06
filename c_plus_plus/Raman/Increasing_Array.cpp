#include<bits/stdc++.h>
using namespace std;
int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
int n;
cin>>n;
vector<long long>ar(n);
for(int i=0;i<n;i++)
cin>>ar[i];

long long sum=0;
for(int i=1;i<n;i++)
{
    sum+= max(ar[i-1] - ar[i],0LL);
}
cout<<sum<<endl;
return 0;
}