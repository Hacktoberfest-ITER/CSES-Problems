#include <iostream>
 
using namespace std;
 
int main()
{
    long long int n,i=5,ans=0;
    cin>>n;
    for(i=5;i<=n;i*=5)
    {
        ans=ans+n/i;
    }
    cout<<ans;
    return 0;
}
