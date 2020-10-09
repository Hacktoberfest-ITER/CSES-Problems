#include<bits/stdc++.h>
using namespace std;
void DFS_util(int node,vector<vector<int>>&mat,vector<bool>&visited)
{
   visited[node]=true;
   for(auto v:mat[node])
   {
       if(!visited[v])
       DFS_util(v,mat,visited);
   }
}
int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
int n,m;
cin>>n>>m;
vector<vector<int>>g(n);
for(int i=0;i<m;i++)
{
    int u,v;
  cin>>u>>v;
  g[u-1].push_back(v-1);
  g[v-1].push_back(u-1);
}
vector<bool>visited(n,false);
vector<int>cities;
int comp=0;
for(int i=0;i<n;i++)
{
    if(!visited[i])
    {   
        cities.push_back(i);
        DFS_util(i,g,visited);
        comp++;
    }
}
int start=cities[0]+1;
cout<<comp-1<<endl;
for(int i=1;i<cities.size();i++)
{
  cout<<start<<" "<<cities[i]+1<<endl;
}


return 0;
}