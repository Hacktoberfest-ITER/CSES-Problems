#include <bits/stdc++.h>
using namespace std;

int main(){
	long long int n;
	scanf("%lld",&n);
	long long int arr[n-1];
	long long int sum=0;
	for (int i=0;i<n-1;i++){
		scanf("%lld",&arr[i]);
		sum+=arr[i];
	}
	long long int c=(n*(n+1))/2;
	printf("%lld",c-sum);
}
