// author: 4yush933
// problem: https://cses.fi/problemset/task/1667/
// Sol: https://cses.fi/problemset/result/1028819/
// Question: Finding shortest path between two nodes in a graph
#pragma GCC optimize("O3")  
#include <bits/stdc++.h>
#include <fstream>
using namespace std;
typedef long long ll;
#define F first
#define pii pair<int,int>
#define S second
#define endl "\n"
#define gcd(a,b) __gcd(a,b)
#define lcm(a,b) (a*b)/gcd(a,b)
#define mem(z,i) memset(z,i,sizeof(z))
#define eps 1e-7
#define I (int)
#define mod 1000000007 
#define pb push_back
const long long INF = 1000000000000000000LL;
template <typename Type>
ostream &operator<<(ostream &out, vector<Type> &vec) {
    for (auto val : vec)
        out << val << " ";
    return out;
}
//const int WASTE=∞;
ll power(ll a,ll b){
	ll i=1;
	while(b){
		if(b%2)
			i=(i*a)%mod;
		b/=2;
		a=(a*a)%mod;
	}
	return i;
}
ll mulmod(ll a, ll b) { 
    ll res = 0;
    a = a % mod; 
    while (b > 0) {
        if (b % 2 == 1) 
            res = (res + a) % mod; 
        a = (a * 2) % mod; 
        b /= 2; 
    }
    return res % mod; 
} 	
const int N=1e5+5;
signed main() {
    ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
  	// cout<<fixed;
  	// cout.precision(10);
  	// ifstream cin  ("alchemy_input.txt");
  	// ofstream cout ("out.txt");
  	//#define int ll
   	int n,m;
   	cin>>n>>m;
   	vector<int>adj[N];
   	while(m--){
   		int a,b;
   		cin>>a>>b;
   		adj[a].pb(b); adj[b].pb(a);
   	}
   	int d[n+1],p[n+1];
   	for(int x=2;x<=n;x++)
   		d[x]=mod;
   	queue<int>q;
   	q.push(1); d[1]=1;
   	while(!q.empty()){
   		int x=q.front(); q.pop();
   		for(int y:adj[x]){
   			if(d[y]==mod) q.push(y);
   			if(d[x]+1<d[y]) d[y]=d[x]+1,p[y]=x;
   		}
   	}
   	if(d[n]==mod) cout<<"IMPOSSIBLE";
   	else{
   		cout<<d[n]<<endl;
   		int i=n; vector<int>v;
   		while(i!=1){
   			v.pb(i); i=p[i];
   		}
   		v.pb(1);
   		reverse(begin(v),end(v));
   		cout<<v;
   	}
  	return 0;
}
// Profile:https://cses.fi/user/13405