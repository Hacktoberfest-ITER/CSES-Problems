#include <iostream>
#include <bits/stdc++.h>

typedef long long ll;

using namespace std;

int main(){
    int n;
    ll start, end;
    ll moviesWatched = 0;
    cin >> n;
    map<ll, ll> movieTimings;
    for(int i = 0; i < n; i++){
        cin >> start >> end;
        if (movieTimings.find(end) == movieTimings.end())
            movieTimings[end] = start;
        movieTimings[end] = max(movieTimings[end], start);
    }
    if (n <= 1){
        cout << n << endl;
        return 0;
    }
    moviesWatched++;
    auto prev = movieTimings.begin();
    int prevNode, currNode;
    for (auto start = next(prev, 1); start != movieTimings.end(); start++){
        prevNode = prev->first;
        currNode = start->second;
        if (prev->first <= start->second){
            moviesWatched++;
            prev = start;
        }
    }

    cout << moviesWatched << endl;
    // Author: psib0t
    // Profile: https://cses.fi/user/26439
}