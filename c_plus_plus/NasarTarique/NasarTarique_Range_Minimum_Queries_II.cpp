// Question : Given an array of n integers, your task is to process q queries of the following types:
//  1.  update the value at position k to u
//  2.  what is the minimum value in range [a,b]?
// 
// Question link : https://cses.fi/problemset/task/1649/
// Solution link : https://cses.fi/problemset/result/1099515/

#include<bits/stdc++.h>
#include <cmath>

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
		st[si] = min(st[(2*si) + 1], st[(2*si) + 2]);
}

ll getrange(ll arr[], ll *st, ll rb ,ll re , ll sb ,ll se , ll in){
		ll mid;
		if(rb<=sb &&  re>=se)
				return st[in];
		if(rb>se||re<sb)
				return LLONG_MAX;

		mid = (sb + se) /2; 
		ll a =getrange(arr ,st,rb ,re , sb ,mid, (2*in) +1 );
		ll b  = getrange(arr ,st,rb ,re , mid+1 ,se , (2*in) +2 );
		return min(a,b);
}
void updateTree(ll *st, ll pos ,ll value, ll sb  ,ll se , ll in){
		ll mid;
		if(pos<sb || pos >se){
				return;
		}

		if(se==sb){
				st[in] = value;
				return;
		}
	
		mid = (sb + se)/2;
		
		updateTree(st , pos , value ,sb,mid,(2*in +1) );
		updateTree(st , pos , value ,mid+1,se,(2*in +2) );
		st[in] = min(st[(2*in)+1], st[(2*in)+2]);
		
}

void update(ll arr[], ll *st, ll pos, ll value , ll arrlength){
		arr[pos] = value;
		updateTree(st, pos,value ,0,arrlength,0);
}
int main(){
		ll n,q;
		cin>>n>>q;
		ll arr[n]; 
		for(ll i =0;i<n;i++){
				cin>>arr[i];
		}
		ll Treesize  = 2*pow(2,ceil(log2(n))) -1 ;
		ll st[Treesize];
		makesegtree(arr, st, 0,(n-1),0);
		while(q--){
				ll k,s,e;
				cin>>k>>s>>e;
				if(k==2)
						cout<<getrange(arr,st,s-1,e-1,0,(n-1),0)<<endl;
				else
						update(arr, st , s-1,e,(n-1));

		}


		return 0;
}
// author: knightnasar
// profile : https://cses.fi/user/32351
