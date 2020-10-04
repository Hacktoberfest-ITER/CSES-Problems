/*

Permutation

A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.

Given n, construct a beautiful permutation if such a permutation exists.

Input

The only input line contains an integer n.

Output

Print a beautiful permutation of integers 1,2,…,n. If there are several solutions, you may print any of them. If there are no solutions, print "NO SOLUTION".

Constraints
1≤n≤10^6

 Question link : https://cses.fi/problemset/task/1070

 Profile Link :https://cses.fi/user/32476

 Author: Sudeep Swain(https://github.com/Sudeep25022000)

*/
#include <iostream>
using namespace std;

int main()
{
    
    int n;
    cin >> n;
    if (n == 1)
    {
        cout << "1";
    }
    else if (n < 4)
    {
        cout << "NO SOLUTION";
    }
    else if (n == 4)
    {
        cout << "3 1 4 2";
    }
    else
    {
        // print odds
        for (int i = 1; i <= n; i += 2)
        {
            cout << i << " ";
        }
        // print evens
        for (int i = 2; i <= n; i += 2)
        {
            cout << i << " ";
        }
    }
    return 0;
}
