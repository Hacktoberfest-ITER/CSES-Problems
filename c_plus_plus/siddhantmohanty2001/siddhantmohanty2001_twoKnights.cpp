#include <iostream>
 
using namespace std;
 
int main()
{
    long long int n,i,s,k;
    cin>>n;
    cout<<0<<endl;
    for(i=2;i<=n;i++)
    {
        k=i*i;
        s=(k*(k-1))/2-4*(i-1)*(i-2);
        cout<<s<<endl;
    }
    return 0;
}
