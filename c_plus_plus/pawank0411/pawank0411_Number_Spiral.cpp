/*
    A number spiral is an infinite grid whose upper-left square has number 1. 
    Your task is to find out the number in row y and column x.

    Question Link : https://cses.fi/problemset/task/1071/
*/
#include <bits/stdc++.h>
using namespace std;

int main()
{

    long long t, x, y;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        cin >> y >> x;
        if (x > y)
        {
            if (x % 2 == 1)
            {
                cout << x * x - y + 1;
            }
            else
            {
                x--;
                cout << x * x + y;
            }
        }
        else
        {
            if (y % 2 == 0)
            {
                cout << y * y - x + 1;
            }
            else
            {
                y--;
                cout << y * y + x;
            }
        }
        cout << "\n";
    }
    return 0;
}
/*
    Author : pawank0411
    Profile Link : https://cses.fi/user/32415
*/