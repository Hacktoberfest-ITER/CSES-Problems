// Weird Algorithm
// https://cses.fi/problemset/task/1068

/* An algorithm takes a +ve num as input, 
    if even: divides the num by 2, 
    if odd: multiply the num by 3 and add 1,
    repeats until num is 1.

    Ex: if n = 3,
        3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
*/

// submission: https://cses.fi/paste/b01c99033090f8de105782/

#include <iostream>
using namespace std;

int main()
{
    long long n;
    cin >> n;

    if(n == 1)
    {
        cout << n << endl;
        return 0;
    }

    cout << n << " ";
    while(1)
    {
        if(n % 2 == 0)
            n /= 2;
        else
            n = n * 3 + 1;
        
        cout << n << " ";

        if(n == 1)
        {
            cout << endl;
            return 0;
        }
    }

    return 0;
}

// author: Subham Sagar Paira
// profile: https://cses.fi/user/32482

