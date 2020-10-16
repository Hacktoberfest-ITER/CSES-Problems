// Question : Given an array of n integers, your task is to process q queries of the form: what is the sum of values in range [a,b]?
// Question Link : https://cses.fi/problemset/task/1646
// Solution  Link :https://cses.fi/problemset/result/1087124/

#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

void makesegtree(ll arr[], ll *st, ll sb ,ll se, ll si){
		ll mid;	
		if(sb == se){
		  st[si] = arr[sb];
		  return;
		}
		mid = (sb + se)	/2;
		makesegtree(arr , st ,sb, mid , (2*si) +1);
		makesegtree(arr , st ,mid+1, se , (2*si) +2);
		st[si] = st[(2*si) + 1]  + st[(2*si) + 2];

}

ll getrange(ll arr[], ll *st, ll rb ,ll re , ll sb ,ll se , ll in){
		ll mid;
		if(rb<=sb &&  re>=se)
				return st[in];
		if(rb>se||re<sb)
				return 0;

		mid = (sb + se) /2; 
		ll a =getrange(arr ,st,rb ,re , sb ,mid, (2*in) +1 );
		ll b  = getrange(arr ,st,rb ,re , mid+1 ,se , (2*in) +2 );
		return (a+b);
}

int main(){
		ll n,q;
		cin>>n>>q;
		ll arr[n]; 
		for(ll i =0;i<n;i++){
				cin>>arr[i];
		}
		ll st[((2*n)-1)];
		makesegtree(arr, st, 0,(n-1),0);
		while(q--){
				ll rb,re;
				cin>>rb>>re;
				cout<<getrange(arr,st,rb-1,re-1,0,(n-1),0)<<endl;

		}


		return 0;
}
// author: knightnasar
// profile : https://cses.fi/user/32351
