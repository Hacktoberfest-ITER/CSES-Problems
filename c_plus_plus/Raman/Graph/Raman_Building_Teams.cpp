#include<bits/stdc++.h>
using namespace std;
#define endl "\n"

bool DFS_color(int node,int col, vector<int>&color,vector<vector<int>>&g)
{
    
    color[node]=col;
    bool res=true;
    for(auto v:g[node])
    {
       
        if(color[v]==0)
        {
         
            res= res&DFS_color(v,(col^3),color,g);            
        }
        if(color[node]==color[v])
        return false;

    }
    return res;
}

int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);

int n,m;
cin>>n>>m;
vector<vector<int>> g(n);
vector<int>color(n,0);

for(int i=0;i<m;i++)
{
    int u,v;
    cin>>u>>v;
    g[u-1].push_back(v-1);
    g[v-1].push_back(u-1);
}
bool res=true;
for(int i=0;i<n;i++)
{
    if(color[i]==0)
    {
       res=res&DFS_color(i,1,color,g);
    }
}
if(res)
{
for(int i=0;i<n;i++)
cout<<color[i]<<" ";
cout<<endl;
}
else
{
cout<<"IMPOSSIBLE\n";
}

return 0;
}