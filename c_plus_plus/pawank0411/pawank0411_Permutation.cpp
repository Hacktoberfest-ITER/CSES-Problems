/*
A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.

Given n, construct a beautiful permutation if such a permutation exists.

Question Link : https://cses.fi/problemset/task/1070/
Profile Link : https://cses.fi/user/32415
author : pawank0411
*/

#include<bits/stdc++.h>

using namespace std;


int main()
{

    int n;
    cin >> n;
    
    if(n == 1) cout << 1 << endl;
    else if (n < 4) cout << "NO SOLUTION" << endl;
    else if (n == 4) cout << "2 4 1 3\n";
    else {
        for (int i = 1; i <= n; i += 2) cout << i << " ";
        for (int i = 2; i <= n; i += 2) {
            cout << i;
            if (i + 2 <= n) cout << " ";
            else cout << endl;
        }
    }
}
