// Ferris Wheel
// https://cses.fi/problemset/task/1090

/* There are n children who want to go to a Ferris wheel,

    Each gondola may have one or two children in it, 
    and in addition, 
    the total weight in a gondola may not exceed x. 
    You know the weight of every child.

    task: find the minimum number of gondolas needed for the children.
*/

// submission: 

#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	long long n, x, temp;
	cin >> n >> x;
	
    long long wchild[n];
	for(long long i = 0; i < n; i++)
        cin >> wchild[i];
	
    sort(wchild, wchild+n);

	long long i, cnt;
	i = cnt = 0;
	n--;
	
	while(i <= n)
	{
		if(wchild[i] + wchild[n] <= x)
		{
			cnt++;
			i++;
			n--;
		}
		else
		{
			n--;
			cnt++;
		}
	}
	cout << cnt << endl;
}

// author: Subham Sagar Paira
// profile: https://cses.fi/user/32482
