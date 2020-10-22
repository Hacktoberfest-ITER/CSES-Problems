#include <iostream>
 
using namespace std;
 
int main()
{
    long long int n,i=1,ans=1,M=1000000007;
    cin>>n;
    for(i=1;i<=n;i++)
        ans=(ans*2)%M;
    cout<<ans%M;
    return 0;
}
