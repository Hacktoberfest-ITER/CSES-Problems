/***************************

	QUESTION- Round Trip
	Link-https://cses.fi/problemset/task/1669 
 
***************************/
 
#include<bits/stdc++.h>
using namespace std;
	
	#define 	ll 					 	long long
	#define 	endl 					"\n"
	#define 	int 					long long
	#define 	fo(i,n)					for(i=0;i<n;i++)
	#define 	re(i,n)					for(i=n-1;i<=0;i--)
	#define 	pb 						push_back
    #define 	mp 						make_pair
	#define 	vi 						vector<int>
	#define 	pii 					pair<int,int>
	#define 	mii 					map<int,int>
	#define 	umii 					unordered_map<int,int>
	#define 	si 						set<int>
	#define 	usi 					unordered_set<int>
	#define 	fast 					ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
	#define		big						LONG_LONG_MAX
	#define 	small					LONG_LONG_MIN
 
int mod = pow(10,9)+7;
int inf=1e18;
vector<vector<int> > adj;
vi color;
vi parent;
int cycleStart,cycleEnd;
 
int Log2(int x){
	int ans=0;
	while(x>>=1)	ans++;
	return ans;
}
 
bool dfs(int v, int p){
	color[v]=1;
	for(auto it: adj[v]){
		if(it==p)	continue;
		if(color[it]==0){
			parent[it]=v;
			if(dfs(it,v))	return true;
		}
		else{
			cycleStart=it;
			cycleEnd=v;
			return true;
		}
	}
 
	color[v]=2;
	return false;
}
 
void solve(){
	int n,m;	cin>>n>>m;
	adj.resize(n+1);
	color.assign(n+1,0);
	parent.assign(n+1,-1);
	cycleStart=-1;
 
	int i;
	fo(i,m){
		int a,b;	cin>>a>>b;
		adj[a].pb(b);
		adj[b].pb(a);
	}
 
	for(int i=1;i<=n;i++){
		if(color[i]==0 && dfs(i,parent[i]))	break;
	}
 
	if(cycleStart==-1){
		cout<<"IMPOSSIBLE"<<endl;
	}
	else{
		vi ans;
		ans.pb(cycleStart);
		for(int v=cycleEnd;v!=cycleStart;v=parent[v]){
			ans.pb(v);
		}
		ans.pb(cycleStart);
		reverse(ans.begin(),ans.end());
		cout<<ans.size()<<endl;
		for(auto it: ans)	cout<<it<<" ";
	}
}
 
void pb_18(){
	#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
	#endif
 
	int t=1;
	while(t--)	solve();
}
 
int32_t main(){
	fast
	pb_18();
	return 0;
}


/******************

	author- cybertron00

******************/