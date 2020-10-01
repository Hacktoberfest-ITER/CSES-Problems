//Problem

// Task is to calculate the number of trailing zeros in the factorial n!.

//Link: https://cses.fi/problemset/task/1618/


#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int trailingZero(long long n)
{
  int x = 5, zero = 0;
  while (n / x != 0)
  {
    zero += n / x;
    x *= 5;
  }
  return zero;
}

int main()
{
  long long n;
  cin >> n;
  cout << trailingZero(n);

  return 0;
}

//author: goel5
//Solution: https://cses.fi/problemset/result/1066999/
