#include <bits/stdc++.h>
using namespace std;

typedef long long int ll;

int main(){
	ll n;
	scanf("%lld",&n);
	ll arr[n];
	for (ll i=0;i<n;i++){
		scanf("%lld",&arr[i]);
	}
	ll sum=0;
	for (ll j=0;j<n-1;j++){
		if (arr[j+1]<=arr[j]){
			sum+=abs(arr[j]-arr[j+1]);
			arr[j+1]=arr[j];
		}
	}
	printf("%lld",sum);
	return 0;
	}
