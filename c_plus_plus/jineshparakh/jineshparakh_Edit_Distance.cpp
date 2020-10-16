/*
PROBLEM STATEMENT:
The edit distance between two strings is the minimum number of operations required to transform one string into the other.

The allowed operations are:
Add one character to the string.
Remove one character from the string.
Replace one character in the string.
For example, the edit distance between LOVE and MOVIE is 2, because you can first replace L with M, and then add I.

Your task is to calculate the edit distance between two strings.

Input

The first input line has a string that contains n characters between A–Z.

The second input line has a string that contains m characters between A–Z.

Output

Print one integer: the edit distance between the strings.

Constraints
1≤n,m≤5000
Example

Input:
LOVE
MOVIE

Output:
2

PROBLEM LINK: https://cses.fi/problemset/task/1639/
SOLUTION LINK: https://cses.fi/problemset/result/1066539/
*/
#include<bits/stdc++.h>
using namespace std;
int main() {
    string s1, s2;
    cin >> s1 >> s2;
    int n1 = s1.size();
    int n2 = s2.size();
    int dp[n1 + 1][n2 + 1];
    dp[0][0] = 0;
    for (int i = 1; i <= n2; i++) {
        dp[0][i] = i;
    }
    for (int i = 1; i <= n1; i++) {
        dp[i][0] = i;
    }
    for (int i = 1; i <= n1; i++) {
        for (int j = 1; j <= n2; j++)  {
            if (s1[i - 1] == s2[j - 1])
                dp[i][j] = dp[i - 1][j - 1];
            else
                dp[i][j] = min(dp[i - 1][j], min(dp[i][j - 1] , dp[i - 1][j - 1])) + 1;
        }
    }
    cout << dp[n1][n2];
    return 0;
}
/*
author: jineshparakh
Profile: https://cses.fi/user/12255
*/