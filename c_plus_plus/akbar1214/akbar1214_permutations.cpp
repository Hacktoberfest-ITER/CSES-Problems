#include <bits/stdc++.h>
#define sc(x) scanf("%d", &x)
#define ll long long
#define FOR(i, a, b) for (int i = a; i < b; i++)
#define FORd(i, a, b) for (int i = a; i > b; i--)
#define ff first
#define ss second
#define reset(x) memset(x, 0, sizeof x)
#define sz(x) x.size()
#define pb push_back

using namespace std;

int main()
{

    int n;
    cin >> n;
    if (n == 2 || n == 3)
    {
        cout << "NO SOLUTION" << endl;
        return 0;
    }

    for (int i = 2; i <= n; i += 2)
    {
        cout << i << " ";
    }
    for (int i = 1; i <= n; i += 2)
    {
        cout << i << " ";
    }
    cout << endl;
    return 0;
}