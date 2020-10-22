// author: 4yush933
// problem: https://cses.fi/problemset/task/1651/
// Sol: https://cses.fi/problemset/result/1103946/
// Question: Standard application of segment tree



// Problem: Range Update Queries
// Contest: CSES - CSES Problem Set
// URL: https://cses.fi/problemset/task/1651
// Memory Limit: 512 MB
// Time Limit: 1000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
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
#define lcm(a,b) a/gcd(a,b)*b
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
//const int WASTE=∞
const int N=2e5+5;
#define int ll
int t[2 * N],n;
void build() {  // build the tree
    for(int x=n-1;x>0;x--) t[x]=t[x*2]+t[x*2+1];
}
void modify(int l,int r,int value) {  // set value at position p
    for(l+=n,r+=n+1;l<r;l/=2,r/=2){
    	if(l&1) t[l++]+=value;
    	if(r&1) t[--r]+=value;
    }
}
int query(int p) {  // sum on interval [l, r]
  int res = 0;
  for(p+=n;p;p/=2) res+=t[p];
  return res;
}
signed main() {
    ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
  	// cout<<fixed;
  	// cout.precision(10);
   	// ofstream cout (".out");
    // ifstream cin  (".in");
    // #define int ll
   	int q;
   	cin>>n>>q;
   	for(int x=0;x<n;x++) cin>>t[x+n];
   	//build();
   	while(q--){
   		int i;
   		cin>>i;
   		if(i==1){
   			int l,r,v;
   			cin>>l>>r>>v;
   			modify(--l,--r,v);
   		}
		else{
			cin>>i; cout<<query(--i)<<endl;
		}
   	}
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
  	return 0;
}
// Profile:https://cses.fi/user/13405