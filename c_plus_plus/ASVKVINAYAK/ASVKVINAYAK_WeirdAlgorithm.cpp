// Weird algorithm
// https://cses.fi/problemset/task/1068

#include<iostream>
using namespace std;

void disp(long long int n)
{
	if(n==1)
	{
		exit(0);
	}
	if(n%2==0)
	{
		n=n/2;
	}
	else
	 n=n*3 +1;
	 cout<<n<<" ";
	 disp(n);
}
int main()
{
     long long int n;
    cin>>n;
    cout<<n<<" ";
    if(n==1)
    {
    	exit(0);
	}
	else
	{
		disp(n);
	}
    return 0;
}

// author: ASVKVINAYAK