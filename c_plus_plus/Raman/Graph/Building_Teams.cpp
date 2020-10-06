#include<bits/stdc++.h>
using namespace std;
#define endl "\n"

bool DFS_color(int node,int col, vector<int>&color,vector<vector<int>>&g,vector<bool>&visited)
{
    visited[node]=true;
    color[node]=col;
    for(auto v:g[node])
    {
        cout<<node<<"  "<<v<<endl;
        if(color[v]==0)
        {
            return  DFS_color(v,(col^3),color,g,visited);            
        }
        if(color[node]==color[v])
        return false;

    }
    return true;
}

int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
//freopen("input.txt","r",stdin);
//freopen("output.txt","w",stdout);
int n,m;
cin>>n>>m;
vector<vector<int>> g(n);
vector<int>color(n,0);
vector<bool> visited(n,false);

for(int i=0;i<m;i++)
{
    int u,v;
    cin>>u>>v;
    g[u-1].push_back(v-1);
    g[v-1].push_back(u-1);
}

for(int i=0;i<n;i++)
{
    if(!visited[i])
    {
        DFS_color(i,1,color,g,visited);
    }
}
for(int i=0;i<n;i++)
cout<<color[i]<<" ";
cout<<endl;

return 0;
}