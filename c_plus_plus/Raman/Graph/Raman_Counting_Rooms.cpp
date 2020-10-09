#include<bits/stdc++.h>
using namespace std;

vector<pair<int,int>> paths={{-1,0},{0,-1},{1,0},{0,1}};
bool valid_node(pair<int,int>&cord,int r,int c)
{
    if(cord.first < r && cord.second < c && cord.first > -1 && cord.second >-1)
    return true;
    return false;
}
void DFS_util(pair<int,int>&node,vector<vector<char>>&mat,vector<vector<bool>>&visited)
{
    
   
    visited[node.first][node.second] =true;
   
    for(auto path:paths)
    {   
         pair<int,int>temp={node.first+path.first,node.second+path.second};
      
        if(valid_node(temp,mat.size(),mat[0].size()) && !visited[temp.first][temp.second])
        {
            DFS_util(temp,mat,visited);
        }
    }
}
int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
int n,m;
cin>>n>>m;
vector<vector<char>>mat(n,vector<char>(m));
vector<vector<bool>>visited(n,vector<bool>(m));
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        cin>>mat[i][j];
        if(mat[i][j]=='#')
        visited[i][j]=true;
        else
        visited[i][j]=false;
        
    }
}
int count=0;
pair<int,int> start;

for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        if(!visited[i][j])
        {
            start={i,j};
            DFS_util(start,mat,visited);
            count++;
        }
    }
}
cout<<count<<endl;

return 0;
}