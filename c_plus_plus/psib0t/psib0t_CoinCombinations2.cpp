#include <iostream>
// #include <fstream>
#include <vector>
#include <algorithm>

using namespace std;
int main(){
    int n, x, temp;
    cin >> n >> x;
    vector<int> coins;
    vector<vector<int>> sum;
    for(int i = 0; i < n; i++){
        cin >> temp;
        coins.push_back(temp);
    }
    sort(coins.begin(), coins.end());
    for (auto k: coins){
        sum.emplace_back(x + 1, 0);
        sum.back().at(0) = 1;
    }
    for (int i = coins[0]; i <= x; i += coins[0])
        sum[0][i] = 1;
    for(int i = 1; i < coins.size(); i++){
        for(int j = 1; j <= x; j++){
            sum[i][j] = sum[i-1][j];
            if (coins[i] <= j)
                sum[i][j] = (sum[i][j] + sum[i][j - coins[i]]) % 1000000007;
        }
    }
    cout << sum.back().back() << endl;
    // Author: psib0t
    // Profile: https://cses.fi/user/26439
}