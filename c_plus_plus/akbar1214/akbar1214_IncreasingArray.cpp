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
    std::vector<int> v(n);
    for (int &x : v)
        cin >> x;
    ll ans = 0;
    FOR(i, 1, n)
    {
        if (v[i] < v[i - 1])
        {
            ans += (v[i - 1] - v[i]);
            v[i] = v[i - 1];
        }
    }
    cout << ans << endl;
}