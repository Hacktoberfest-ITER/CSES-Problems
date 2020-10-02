// author: 4yush933
// problem: https://cses.fi/problemset/task/1679/
// Sol: https://cses.fi/problemset/result/1023749/
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
vector<int>adj[N],v;
bool vis[N],f=0,z[N];
void dfs(int x){
	vis[x]=1; z[x]=1;
	for(int y:adj[x])
		if(!vis[y]){
			//unordered_map<int,int>ss=s;
			//z[y]=1;
			dfs(y);
		}
		else if(z[y]) f=1;
	v.pb(x); z[x]=0;
}
signed main() {
    ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
  	// cout<<fixed;
  	// cout.precision(10);
  	// ifstream cin  ("alchemy_input.txt");
  	// ofstream cout ("out.txt");
  	//#define int ll
   	int n,m;
   	cin>>n>>m;
   	while(m--){
   		int a,b;
   		cin>>a>>b;
   		adj[a].pb(b);
   	}
   	for(int x=1;x<=n;x++)
   		if(!vis[x]){
   			mem(z,0);
   			//z[x]=1;
   			dfs(x);
   		}
   	reverse(begin(v),end(v));
   	if(f) cout<<"IMPOSSIBLE";
   	else 
   	for(int x:v) cout<<x<<' ';
  	return 0;
}