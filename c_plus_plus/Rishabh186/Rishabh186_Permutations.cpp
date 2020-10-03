//A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.
//Given n, construct a beautiful permutation if such a permutation exists.

//Link : https://cses.fi/problemset/task/1070/



#include<bits/stdc++.h>
#define ll long long

using namespace std;
int main(){

     ll n;cin>>n;
     if(n==2 ||n==3){
       cout<<"NO SOLUTION"<<endl;
       return 0;
   }
   //Checking odd
   if(n&1){
   	    for(int i=1;i<=n;i++){
   	    	if(i&1)
   	    	 cout<<i<<" ";
		}

		for(int i=2;i<n;i++){
			if(i&1^1)   //Checking i is even
			 cout<<i<<" ";
	}

   }

   else
   {
   		for(int i=2;i<=n;i++){
			if(i&1^1)
			 cout<<i<<" ";
		}

		  for(int i=1;i<=n;i++){
   	    	if(i&1)
   	    	 cout<<i<<" ";
		}

   }

}

//author:stark18
