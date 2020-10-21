/*
PROBLEM STATEMENT:
Byteland has n cities, and m roads between them. The goal is to construct new roads so that there is a route between any two cities.

Your task is to find out the minimum number of roads required, and also determine which roads should be built.

Input

The first input line has two integers n and m: the number of cities and roads. The cities are numbered 1,2,…,n.

After that, there are m lines describing the roads. Each line has two integers a and b: there is a road between those cities.

A road always connects two different cities, and there is at most one road between any two cities.

Output

First print an integer k: the number of required roads.

Then, print k lines that describe the new roads. You can print any valid solution.

Constraints
1≤n≤105
1≤m≤2⋅105
1≤a,b≤n
Example

Input:
4 2
1 2
3 4

Output:
1
2 3

PROBLEM LINK: https://cses.fi/problemset/task/1666/
SOLUTION LINK: https://cses.fi/problemset/result/1066508/
*/
#include<bits/stdc++.h>
using namespace std;
#define pb push_back

int n, m;
const int maxN = 2e5 + 10;
vector<int> v[maxN];
int vis[maxN] = {0};
int dist[maxN];
void dfs(int node) {
    if (vis[node])
        return;
    vis[node] = 1;
    for (auto i : v[node]) {
        dfs(i);
    }
}
bool isfilled() {
    for (int i = 1; i <= n; i++) {
        if (vis[i] != 1) {
            return 0;
        }
    }
    return 1;
}
int main() {

    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        int xx, yy; cin >> xx >> yy ;
        v[xx].pb(yy);
        v[yy].pb(xx);
    }
    dfs(1);
    vector<pair<int, int> > ans;
    while (1) {
        if (isfilled())
            break;
        for (int i = 2; i <= n; i++) {
            if (vis[i] == 0) {
                v[1].pb(i);
                v[i].pb(1);
                ans.pb(make_pair(1, i));
                dfs(i);

            }
        }
    }
    cout << ans.size() << endl;
    for (auto i : ans) {
        cout << i.first << " " << i.second << endl;
    }
    return 0;
}
/*
author: jineshparakh
Profile: https://cses.fi/user/12255
*/