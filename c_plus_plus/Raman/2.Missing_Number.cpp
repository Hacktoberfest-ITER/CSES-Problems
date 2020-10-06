#include<bits/stdc++.h>
using namespace std;
int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
int n;
cin>>n;
vector<int> ar(n);
for(int i=0;i<n;i++)
cin>>ar[i];

int ans = ar[0];
ans^=1;
for(int i=1;i<n;i++)
{ans ^= ar[i];
 ans ^= (i+1);
}
cout<<ans<<endl;

return 0;
}