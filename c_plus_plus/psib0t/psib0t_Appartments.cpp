#include <iostream>
#include <bits/stdc++.h>
#include <fstream>
#define forLoop(ini,n) for(int i = ini; i < n; i++)

using namespace std;

int main(){
    int n, m, temp;
    long long k;
    int i1, i2, count = 0;
    cin >> n >> m >> k;
    vector<long long> dAppartments;
    vector<long long> appartments;
    forLoop(0, n){
        cin >> temp;
        dAppartments.push_back(temp);
    }
    forLoop(0, m){
        cin >> temp;
        appartments.push_back(temp);
    }
    sort(dAppartments.begin(), dAppartments.end());
    sort(appartments.begin(), appartments.end());
    i1 = 0;i2 = 0;
    while(i1 < n && i2 < m){
        if (dAppartments[i1] < appartments[i2] - k)
            i1++;
        else if(dAppartments[i1] > appartments[i2] + k)
            i2++;
        else {
            count++;
            i1++;
            i2++;
        }

    }
    cout << count << endl;
    // Author: psib0t
    // Profile: https://cses.fi/user/26439
}