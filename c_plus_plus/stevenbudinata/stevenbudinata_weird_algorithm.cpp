// Question:
/*
  Consider an algorithm that takes as input a positive integer n. 
  If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. 
  The algorithm repeats this, until n is one
*/

// link: https://cses.fi/problemset/task/1068

#include<bits/stdc++.h>
using namespace std;

int main() {
  long long int n;
  cin>>n;

  vector<long long int> ans;
  while (n >= 1) {
    ans.push_back(n);

    if(n==1) break;
    if (n % 2 == 0) {
      n /= 2;
      continue;
    }
    n = n*3 + 1;
  }

  for (int i=0; i<ans.size(); i++) {
    printf("%lld ", ans[i]);

  }
  return 0;
}

// author: stevenbudinata
// solution: https://cses.fi/problemset/result/1065872/