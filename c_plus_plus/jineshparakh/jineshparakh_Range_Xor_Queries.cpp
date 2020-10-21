/*
PROBLEM STATEMENT:
Given an array of n integers, your task is to process q queries of the form: what is the xor sum of values in range [a,b]?

Input

The first input line has two integers n and q: the number of values and queries.

The second line has n integers x1,x2,…,xn: the array values.

Finally, there are q lines describing the queries. Each line has two integers a and b: what is the xor sum of values in range [a,b]?

Output

Print the result of each query.

Constraints
1≤n,q≤2⋅105
1≤xi≤109
1≤a≤b≤n
Example

Input:
8 4
3 2 4 5 1 1 5 3
2 4
5 6
1 8
3 3

Output:
3
0
6
4

PROBLEM LINK:https://cses.fi/problemset/task/1650/
SOLUTION LINK: https://cses.fi/problemset/result/1066628/
*/
#include<bits/stdc++.h>
using namespace std;

const int MAX = 1e6;
const int INF = 1e8;
int a[MAX]; // the main input array
int tree[2 * MAX]; // the segment tree array

void buildTree(int currentNode, int startIndex, int endIndex) {
    if (startIndex == endIndex) {
        tree[currentNode] = a[startIndex];
    }
    else {
        int mid = (startIndex + endIndex) / 2;
        buildTree(2 * currentNode, startIndex, mid);
        buildTree((2 * currentNode) + 1, mid + 1, endIndex);
        tree[currentNode] = tree[2 * currentNode] ^ tree[(2 * currentNode) + 1];
    }
}
int query(int currentNode, int startIndex, int endIndex, int queryStart , int queryEnd) {
    if (queryStart > endIndex || queryEnd < startIndex) //completely outside
        return 0;
    if (startIndex >= queryStart && endIndex <= queryEnd) { //completely inside
        return tree[currentNode];
    }
    int mid = (startIndex + endIndex) / 2;
    return query(2 * currentNode, startIndex, mid, queryStart, queryEnd)^query(2 * currentNode + 1, mid + 1, endIndex, queryStart, queryEnd);
}

int main() {

    int n;
    cin >> n;
    int q; cin >> q;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
    }
    buildTree(1, 1, n);

    while (q--) {
        int l, r;
        cin >> l >> r;
        cout << query(1, 1, n, l , r) << endl;

    }


    return 0;
}
/*
author: jineshparakh
Profile: https://cses.fi/user/12255
*/