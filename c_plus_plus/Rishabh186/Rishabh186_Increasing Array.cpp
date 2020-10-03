//You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as 
//large as the previous element.
//
//On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

//Link: https://cses.fi/problemset/task/1094/


#include<bits/stdc++.h>
using namespace std;

int main(){

    long long n;
	cin>>n;
    long long a[n];
    for(long long i=0;i<n;i++){
    	cin>>a[i];
	}

    long long ans=0;
    for(long long i=1;i<n;i++){
    	if(a[i]<a[i-1]){
    		long long d=a[i-1]-a[i];
    		a[i]=a[i]+d;
    		ans+=d;		
		}
	}
	cout<<ans<<endl;


	return 0;
}

//author:stark18
