// Question :  Given an array of n integers, your task is to process q queries of the following types:
//  1 . update the value at position k to u
//  2 . what is the sum of values in range [a,b]?
//
// Question link : https://cses.fi/problemset/task/1648/
// Solution link : https://cses.fi/problemset/result/1099507/

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
void updateTree(ll *st , ll pos , ll diff, ll sb , ll se ,ll in){

		if(se<pos || sb>pos){
				return;	
		}
		st[in] +=diff;
		if(se!=sb){

		ll mid = (sb + se )/2;
		updateTree(st,pos,diff,sb,mid,(2*in)+1);
		updateTree(st,pos,diff,mid+1,se,(2*in)+2);

		}

}
void update(ll arr[] , ll *st , ll pos , ll value,ll arrlength){
		ll diff = value -  arr[pos] ;
		arr[pos] = value;
		updateTree(st,pos,diff,0,arrlength-1,0);
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
				ll k ,a ,b;
				cin>>k>>a>>b;
				if(k==2)
						cout<<getrange(arr,st,a-1,b-1,0,(n-1),0)<<endl;
				if(k==1)
						update(arr,st,a-1,b,n);

		}
		return 0;
}

// author: knightnasar
// profile : https://cses.fi/user/32351
