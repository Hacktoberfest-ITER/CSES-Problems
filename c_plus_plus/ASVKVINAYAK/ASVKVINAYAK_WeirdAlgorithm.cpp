/*
Weird algorithm
Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3?10?5?16?8?4?2?1

Your task is to simulate the execution of the algorithm for a given value of n.

 Question link : https://cses.fi/problemset/task/1068
 Profile Link :https://cses.fi/user/32376 
 Author: ASVKVINAYAK
*/

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
