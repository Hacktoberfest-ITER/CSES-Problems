// Missing Number
// https://cses.fi/problemset/task/1083

/* Given n and n-1 values as input, 
    task: find the missing number between 1 and n.
*/

// submission: 

#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    cin >> n;

    int arr[n-1];
    for(int i = 0; i < n-1; i++)
        cin >> arr[i];

    if(n == 2)
    {
        if(arr[0] == 2)
            cout << 1 << endl;
        else
            cout << 2 << endl;
        
        return 0;
    }

    sort(arr, arr + n-1);

    for(int i = 1; i < n-1; i++)
        if(arr[i] - arr[i-1] != 1)
        {
            cout << arr[i]-1 << endl;
            return 0;
        }

    cout << n << endl;

    return 0;
}

// author: Subham Sagar Paira
// profile: https://cses.fi/user/32482