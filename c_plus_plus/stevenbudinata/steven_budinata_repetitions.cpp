// Repetitions
// https://cses.fi/problemset/task/1069

#include<bits/stdc++.h>
using namespace std;

int main() {
  string input;
  cin>>input;

  int ans = 1;
  int tempChain = 1;

  for (int i=1; i<input.length(); i++) {
    if (input[i] == input[i-1]) {
      tempChain++;
      ans = tempChain > ans ? tempChain : ans;
    } else {
      tempChain = 1;
    }
  }

  printf("%d\n", ans);

  return 0;   
}

// author: stevenbudinata
// solution: https://cses.fi/problemset/result/1065652/