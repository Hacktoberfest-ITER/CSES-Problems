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

    ll n;
    cin >> n;
    ll sum = (n * (n + 1)) / 2;
    if (sum % 2 == 1)
    {
        cout << "NO" << endl;
        return 0;
    }
    set<int> se;
    ll req = sum / 2;
    ll li = n;
    while (req > 0)
    {

        if (req - li >= 0)
        {
            se.insert(li);
            req -= li;
        }
        li--;
    }
    cout << "YES\n";
    cout << se.size() << "\n";
    for (auto &x : se)
        cout << x << " ";
    cout << "\n";
    cout << n - se.size() << "\n";
    FOR(i, 1, n + 1)
    {

        if (!se.count(i))
        {
            cout << i << " ";
        }
    }
    cout << endl;
    return 0;
}