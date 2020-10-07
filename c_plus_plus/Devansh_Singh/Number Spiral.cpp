#include <bits/stdc++.h>
using namespace std;

typedef long long int ll;

int main(){
	ll t;
	scanf("%lld",&t);
	while (t>0){
		ll x,y;
		scanf("%lld %lld",&x,&y);
		if (x<y){
			ll s=0;
			if (y%2!=0){
				s+=((y*y)-x)+1;
			}else{
				s+=((y-1)*(y-1))+x;
			}
			printf("%lld\n",s);
		}else{
			ll s=0;
			if (x%2!=0){
				s+=((x-1)*(x-1))+y;
			}else{
				s+=((x*x)-y)+1;
			}
			printf("%lld\n",s);
		}
		t--;
	}
	return 0;
	}
