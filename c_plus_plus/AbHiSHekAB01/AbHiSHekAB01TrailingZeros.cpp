
//Your task is to calculate the number of trailing zeros in the factorial n!.

//For example, 20!=2432902008176640000 and it has 4 trailing zeros.

//author:AbHiSHekAB01;


#include <iostream>

int main() {
  std::cout ;
int k;
    std::cin >> k;
    int t = 0;
    for (int i = 5; k / i >= 1; i *= 5)
    {
        t += k / i;
    }
      std::cout << t;
    return 0;}


//cses user id:- https://cses.fi/user/32825