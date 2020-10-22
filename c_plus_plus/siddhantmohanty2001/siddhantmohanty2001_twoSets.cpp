#include <iostream>
#include<vector>
using namespace std;
int main()
{
   long long int n,s=0,q,r,i;
   cin>>n;
   s=(n*(n+1))/2;
   if(s%2==0)
   {
    cout<<"YES"<<endl;
    s=s/2;
    q=s/(n+1);
    r=s%(n+1);
    if(r==0)
        cout<<2*q<<endl;
    else
    cout<<2*q+1<<endl;
    for(i=1;i<=q;i++)
    {
        cout<<i<<" "<<n-i+1<<" ";
    }
    if(r>0)
        cout<<n-q;
        cout<<endl;
    if(r==0)
        cout<<n-2*q<<endl;
    else
        cout<<n-2*q-1<<endl;
    if(r==0)
    {
        for(i=q+1;i<=n-q;i++)
            cout<<i<<" ";
 
    }
    else
    {
        for(i=q+1;i<n-q;i++)
            cout<<i<<" ";
    }
    cout<<endl;
     }
   else
  cout<<"NO";
    return 0;
}
