// Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two,
//  and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one.

//author:AbHiSHekAB01

#include<iostream>
using namespace std;
int main()
{
	long x;
	cin>>x;
	cout<<x<<" ";
	
         for(x;x!=1;)
          { 
	        if(x%2==0)
	         {
	           x=x/2;
	           cout<<x<<" ";
               } 
               if(x%2==1&&x!=1)
	            {
	            	x=(x*3)+1;
            		cout<<x<<" ";
	            }
          } 
 return 0;
}

//cses user id- https://cses.fi/user/32825
