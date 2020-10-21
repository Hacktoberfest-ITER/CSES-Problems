#include <bits/stdc++.h>
#define sc(x) scanf("%d", &x)
#define ll unsigned long long
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

    ll x;
    cin >> x;
    FOR(i, 1, x + 1)
    {
        ll n = i;
        ll cr = ((n * n) * (n * n - 1)) / 2;
        cr -= 4 * (n - 1) * (n - 2);
        cout << cr << endl;
    }
    return 0;
}