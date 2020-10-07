#include <iostream>
// #include <fstream>
#include <vector>
#include <algorithm>
#include <limits.h>

using namespace std;
int main(){
    int n, temp;
    cin >> n;
    vector<int> minStepsVec;
    if (n >= 1 && n <= 9) {
        cout << 1 << endl;
        return 0;
    }
    for(int i = 0; i <= 9; i++)
        minStepsVec.push_back(1);
    for (int i = 10; i <= n; i++){
        temp = i;
        minStepsVec.push_back(INT_MAX - 8);
        while (temp){
            minStepsVec[i] = min(minStepsVec[i], minStepsVec[i - temp % 10] + 1);
            temp /= 10;
        }

    }

    cout << minStepsVec[n] << endl;
    // Author: psib0t
    // Profile: https://cses.fi/user/26439
}