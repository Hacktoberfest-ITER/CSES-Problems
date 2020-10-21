/*
Consider an algorithm that takes as input a positive integer n.
 If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.
  The algorithm repeats this, until n is one.

Your task is to simulate the execution of the algorithm for a given value of n.
*/
// link : https://cses.fi/problemset/task/1068/

#include<iostream>
using namespace std;

 int main()
 {
    long long n;
    cin>>n;
    while(n!=1)
    {
        cout<<n<<" ";
        if(n%2==0) n/=2;
        else n=n*3+1;
    }
    cout<<1;
 }

 //author  : Ayushsahoo
 //profile : https://cses.fi/user/32495
