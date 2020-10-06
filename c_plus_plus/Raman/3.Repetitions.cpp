#include<bits/stdc++.h>
using namespace std;
int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
string s;
cin>>s;
int max =0,count;

for(int i=0;i<s.length();i++)
{    char temp =s[i];
count =0;
    while(i<s.length() && s[i]==temp)
    {
        count++;
        i++;
    }
    i--;
    if(count > max)
     max =count;
}
cout<<max<<endl;
return 0;
}