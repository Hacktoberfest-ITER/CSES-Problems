/*

QUESTION PROBLEM STATEMENT:
You are given a map of a building, and your task is to count the number of its rooms. The size of the map is n×m squares, and each square is either floor or wall. You can walk left, right, up, and down through the floor squares.

Input

The first input line has two integers n and m: the height and width of the map.

Then there are n lines of m characters describing the map. Each character is either . (floor) or # (wall).

Output

Print one integer: the number of rooms.

Constraints
1≤n,m≤1000
Example

Input:
5 8
########
#..#...#
####.#.#
#..#...#
########

Output:
3

PROBLEM LINK: https://cses.fi/problemset/task/1192
SOLUTION LINK: https://cses.fi/problemset/result/1066445/
*/

#include<bits/stdc++.h>
using namespace std;

int n, m;
char a[1001][1001];
int  vis[1001][1001];
int dr[] = { -1, 1, 0, 0};
int dc[] = {0, 0, 1, -1};
bool isValid(int x, int y) {
    return (x >= 0 && x < n && y >= 0 && y < m);
}
void dfs(int x, int y) {
    if (vis[x][y])
        return;
    if (a[x][y] == '#')
        return;
    vis[x][y] = 1;
    for (int i = 0; i < 4; i++) {
        int xx = x + dr[i];
        int yy = y + dc[i];
        if (isValid(xx, yy)) {
            if (!vis[xx][yy] && a[xx][yy] != '#')
                dfs(xx, yy);
        }
    }
}
int main() {
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        string s; cin >> s;
        for (int j = 0; j < m; j++) {
            a[i][j] = s[j];
        }
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (!vis[i][j] && a[i][j] == '.') {
                dfs(i, j);
                ans++;
            }
        }
    }
    cout << ans;
    return 0;
}

/*

author: jineshparakh
Profile: https://cses.fi/user/12255
*/
