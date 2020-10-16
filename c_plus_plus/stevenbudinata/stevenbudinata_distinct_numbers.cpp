// Question:
/*
  You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
*/

// link: https://cses.fi/problemset/task/1621/

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
    
    if (dictionary[temp] == 1)  ans++;
  }
  
  printf("%d\n", ans);
  return 0;   
}

// author: stevenbudinata
// solution: https://cses.fi/problemset/result/1065609/