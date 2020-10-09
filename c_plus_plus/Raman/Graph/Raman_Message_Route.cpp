#include<bits/stdc++.h>
using namespace std;

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
vector<int>path(n);
queue<int>Q;
Q.push(0);
visited[0]=true;
path[0]=-1;
while (!Q.empty())
{
    int u=Q.front();
    Q.pop();
    for(auto v:g[u])
    {
        if(!visited[v])
        {
           visited[v]=true;
           Q.push(v);
           path[v]=u;
        }
    }
}
vector<int>route;

if(visited[n-1])
{
    for(int i=n-1;i!=-1;)
{
    route.push_back(i+1);
    i=path[i];
}
cout<<route.size()<<endl;
for(auto i=route.rbegin();i!=route.rend();i++)
cout<<*i<<' ';
cout<<endl;
}else
{
    cout<<"IMPOSSIBLE\n";
}


return 0;
}