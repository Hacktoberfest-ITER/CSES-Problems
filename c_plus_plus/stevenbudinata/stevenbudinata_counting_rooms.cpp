// Counting Rooms
// https://cses.fi/problemset/task/1192

#include<bits/stdc++.h>
using namespace std;

vector<string> building;

int temp = 0;
void floodFill(int y, int x, int h, int w) {
  if (y < 0 || y >= h || x < 0 || x >=w) return; 
  if (building[y][x] == '#') return;

  building[y][x] = '#';
  temp++;

  floodFill(y-1, x, h, w);
  floodFill(y+1, x, h, w);
  floodFill(y, x+1, h, w);
  floodFill(y, x-1, h, w);
}

int main() {
  int w, h;
  int ans = 0;

  scanf("%d %d", &h, &w);

  for(int i=0; i<h; i++) {
    string temp;
    cin>>temp;
    building.push_back(temp);
  }

  for(int i=0; i<h; i++) {
    for (int j=0; j<w; j++) {
      floodFill(i, j, h, w);
      if (temp > 0) ans++;
      temp = 0;
    }
  }

  printf("%d\n", ans);
  return 0;
}

// author: stevenbudinata
// solution: https://cses.fi/problemset/result/1065776/