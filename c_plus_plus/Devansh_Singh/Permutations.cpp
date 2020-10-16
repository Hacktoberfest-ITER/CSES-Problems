#include <bits/stdc++.h>
using namespace std;

typedef long long int ll;

int main(){
	ll n;
	scanf("%lld",&n);
	if (n==1){
		printf("1\n");
	}else if(n<4){
		printf("NO SOLUTION\n");
	}else if (n==4){
		printf("3 1 4 2\n");
	}else{
		for (ll i=1;i<=n;i+=2){
			printf("%d",i);
			printf(" ");
		}
		for (ll j=2;j<=n;j+=2){
			printf("%d",j);
			printf(" ");
		}
	}
	return 0;
	}
