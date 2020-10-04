//Your task is to calculate the number of trailing zeros in the factorial n!.
//For example, 20!=2432902008176640000 and it has 4 trailing zeros.
//program link:https://cses.fi/problemset/task/1618
//Author:AkhileshMattam
//profile link:https://cses.fi/user/32346
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