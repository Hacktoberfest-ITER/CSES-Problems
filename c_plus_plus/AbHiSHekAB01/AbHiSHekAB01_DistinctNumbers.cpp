//You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

//author:AbHiSHekAB01

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main()
{
	int n,c,count=1;
	vector<int> a;
    cin>>n;
    for(int x=0;x<n;++x)
    {
    	cin>>c;
    	a.push_back(c);
	}
	sort(a.begin(),a.end());
	vector<int>::iterator it;
	for(it=a.begin();it!=a.end()-1;++it)
	{
		if(n==1)
		{cout<<"1";
		break;}
		else
		 if(*it!=*(it+1))
		 count+=1;
	}
cout<<count;
return 0;
}


//cses user id- https://cses.fi/user/32825