#include <iostream>
 
using namespace std;
char alpha(long long int n)
{
    char a='A';
    long long int i=0;
    while(i<n)
    {
        i++;
        a++;
    }
    return a;
}
int main()
{
    string s;
    cin>>s;
    long long int i,n=s.length(),c[26],flag=0,k,x=0;
    for(i=0;i<26;i++)
        c[i]=0;
    for(i=0;i<n;i++)
    {
        c[s[i]-65]++;
    }
    for(i=0;i<26;i++)
    {
        if(c[i]%2!=0)
        {
            flag++;
            x=i;
        }
    }
 
    if(n%2==0&&flag!=0)
        cout<<"NO SOLUTION";
    else if(n%2!=0&&flag!=1)
        cout<<"NO SOLUTION";
    else
    {
        for(i=0;i<26;i++)
        {
            if(i!=x)
            {
            k=c[i]/2;
            while(k--)
                cout<<alpha(i);
            }
        }
        while(c[x]--)
            cout<<alpha(x);
        for(i=25;i>=0;i--)
        {
            k=c[i]/2;
            while(k--)
            cout<<alpha(i);
 
        }
    }
    return 0;
}
