#include <iostream>
// #include <fstream>
#include <vector>
#include <algorithm>

using namespace std;
int main(){

    int n, x, temp;
    cin >> n >> x;
    vector<int> coins;
    vector<int> sum;
    for(int i = 0; i < n; i++){
        cin >> temp;
        coins.push_back(temp);
    }
    sort(coins.begin(), coins.end());

    cout << endl;
    sum.push_back(1);
    for(int i = 1; i <= x; i++){
        sum.push_back(0);
        for(int j = 0; j < n; j++){
            if(coins.at(j) > i)
                break;
            sum.at(i) = (sum.at(i) + sum.at(i - coins[j])) % 1000000007;
        }
        //cout << "i is " << i << endl;
    }
    cout << sum[x] << endl;
    // ifs.close();

    // Author: psib0t
    // Profile: https://cses.fi/user/26439
}