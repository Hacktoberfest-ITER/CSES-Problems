// Question:
/*
  You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
*/

// link: https://cses.fi/problemset/task/1083

#include<bits/stdc++.h>
using namespace std;

int main() {
  int n;
  map<int, int> dictionary;
  
  int ans = 0;
  scanf("%d", &n);

  for(int i=0; i<n; i++) {
    int temp;
    scanf("%d", &temp);

    dictionary[temp]++;
  }
  
  for(int i=1; i<=n; i++) {
    if (dictionary[i] == 0) {
      ans = i;
      break;
    }
  }

  printf("%d\n", ans);
  return 0;   
}

// author: stevenbudinata
// solution: https://cses.fi/problemset/result/1065620/