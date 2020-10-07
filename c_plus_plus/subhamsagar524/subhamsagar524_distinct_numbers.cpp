// Distinct Numbers
// https://cses.fi/problemset/task/1621

/* Input n and n numbers list, 
    task: calculate the number of distinct values in the list.
*/

// submission: 

#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n, res = 0;
    cin >> n;

    long long arr[n];
    for(int i = 0; i < n; i++)
        cin >> arr[i];

    sort(arr, arr+n);

    for(int i = 0; i < n; i++)
    {
        while (i < n - 1 && arr[i+1] == arr[i])
            i++;
        res++;
    }

    cout << res << endl;

    return 0;
}

// author: Subham Sagar Paira
// profile: https://cses.fi/user/32482
