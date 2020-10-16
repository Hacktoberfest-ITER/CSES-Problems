/*
PROBLEM STATEMENT:
You are given a tree consisting of n nodes.

Your task is to determine for each node the maximum distance to another node.

Input

The first input line contains an integer n: the number of nodes. The nodes are numbered 1,2,…,n.

Then there are n−1 lines describing the edges. Each line contains two integers a and b: there is an edge between nodes a and b.

Output

Print n integers: for each node 1,2,…,n, the maximum distance to another node.

Constraints
1≤n≤2⋅105
1≤a,b≤n
Example

Input:
5
1 2
1 3
3 4
3 5

Output:
2 3 2 3 3

PROBLEM LINK: https://cses.fi/problemset/task/1132/
SOLUTION LINK: https://cses.fi/problemset/result/1066613/
*/
#include<bits/stdc++.h>
using namespace std;
#define pb push_back

int n;
const int maxN = 2e5 + 20;
vector<int> v[maxN];
int lv[maxN];
int d1[maxN];
int d2[maxN];
void dfs1(int x, int par, int d) {
    d1[x] = d;
    for (auto i : v[x]) {
        if (i != par) {
            dfs1(i, x, d + 1);
        }
    }
}
void dfs2(int x, int par, int d) {
    d2[x] = d;
    for (auto i : v[x]) {
        if (i != par) {
            dfs2(i, x, d + 1);
        }
    }
}
int main() {
    cin >> n;
    for (int i = 0; i < n - 1; i++) {
        int x, y; cin >> x >> y;
        v[x].pb(y);
        v[y].pb(x);
    }
    dfs1(1, 0, 0);
    int next = 0, maxx = 0;
    for (int i = 1; i <= n; i++) {
        if (d1[i] >= maxx) {
            maxx = d1[i];
            next = i;
        }
    }
    dfs2(next, 0, 0);
    for (int i = 1; i <= n; i++) {
        if (d2[i] >= maxx) {
            maxx = d2[i];
            next = i;
        }
    }
    memset(d1, 0, sizeof(d1));
    dfs1(next, 0, 0);
    for (int i = 1; i <= n; i++) {
        cout << max(d1[i], d2[i]) << " ";
    }
    return 0;
}
/*
author: jineshparakh
Profile: https://cses.fi/user/12255
*/