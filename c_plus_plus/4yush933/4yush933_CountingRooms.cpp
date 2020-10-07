// author:4yush933
// problem:https://cses.fi/problemset/task/1192/
// sol:https://cses.fi/problemset/result/999581/
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
const int N=1e3+5;
char adj[N][N];
int n,m;
bool visit[N][N];
void ff(int x,int y){
	if(!x||!y||x>n||y>m||adj[x][y]=='#') return;
	if(visit[x][y]) return;
	visit[x][y]=1;
	ff(x+1,y); ff(x-1,y);
	ff(x,y+1); ff(x,y-1);
}
signed main() {
    ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
  	// cout<<fixed;
  	// cout.precision(10);
  	// ifstream cin  ("alchemy_input.txt");
  	// ofstream cout ("out.txt");
  	//#define int ll
   	//int n,m;
   	cin>>n>>m;
   	for(int x=1;x<=n;x++)
   		for(int y=1;y<=m;y++)
   			cin>>adj[x][y];
   	int ans=0;
   	for(int x=1;x<=n;x++){
   		for(int y=1;y<=n;y++){
   			if(!visit[x][y]&&adj[x][y]=='.'){
   				ans++;
   				ff(x,y);
   			}
   		}
   	}
   	cout<<ans;
  	return 0;
}