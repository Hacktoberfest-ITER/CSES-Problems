#include <iostream>
 
using namespace std;
 
int main()
{
    long long int t;
    cin>>t;
    while(t--)
    {
        long long int a,b,mini,maxi;
        cin>>a>>b;
        mini=min(a,b);
        maxi=max(a,b);
        if(a==0&&b==0)
            cout<<"YES"<<endl;
        else if(maxi<=2*mini&&(a+b)%3==0&&a>=1&&b>=1)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    return 0;
}
