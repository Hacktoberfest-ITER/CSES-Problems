/*

Weird algorithm

Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3?10?5?16?8?4?2?1
Your task is to simulate the execution of the algorithm for a given value of n.

 Question link : https://cses.fi/problemset/task/1068/

 Profile Link :https://cses.fi/user/32476

 Author: Sudeep Swain(https://github.com/Sudeep25022000)

*/

#include <iostream>
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
    /* commented line
    while(n >= 1 ){
        n = (n%2==0) ? n = n/2 : n = (n * 3) + 1;;
        cout << n ;
        cout << " ";
    }
    */
    return 0;
}
