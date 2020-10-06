// Trailing Zeros
// https://cses.fi/problemset/task/1618

/* Given n as input, 
    task: calculate the number of trailing zeros in the factorial n!.
*/

// submission: https://cses.fi/paste/e33826e28687e039109f77/

#include <iostream>
using namespace std;

int main()
{
	long long num;
	cin >> num;

	int res = 0;

	for(long long i = 5; num/i >= 1; i *= 5)
		res += num/i;

	cout << res << endl;

	return 0;
}

// author: Subham Sagar Paira
// profile: https://cses.fi/user/32482
