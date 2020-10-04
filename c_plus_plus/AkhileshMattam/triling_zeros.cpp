#include <iostream>
using namespace std;
int main()
{
int n,c=0;
cin>>n;
for(int i=5;n/i>=1;i=i*5)
c=c+n/i;
cout<<c;
return 0;
}