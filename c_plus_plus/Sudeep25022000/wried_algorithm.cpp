//Q1>Program code for Wried Algorithm
#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    long long int n;
    cin >> n;
    while(n >= 1 ){
        if(n%2==0){
            n = n/2;
            cout << n ;
            cout << " ";
        }
        else{
            n = (n * 3) + 1;
            cout << n ;
            cout << " ";
        }
    }
    return 0;
}
