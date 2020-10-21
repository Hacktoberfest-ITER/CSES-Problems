#include<bits/stdc++.h>
using namespace std;

vector<pair<int,int>> paths={{-1,0},{0,-1},{1,0},{0,1}};

bool valid_node(pair<int,int>&cord,int r,int c)
{
    if(cord.first < r && cord.second < c && cord.first > -1 && cord.second >-1)
    return true;
    return false;
}
char direct(pair<int,int>&after,pair<int,int>&before)
{
    int x=after.first - before.first;
    int y=after.second - before.second;
    if(y==0)
    {
        if(x==1)
        return 'D';
        return 'U';
    }
    else
    {
        if(y==1)
        return 'R';
        return 'L';
    }
    
}
void genpath(pair<int,int>&end,pair<int,int>&start,vector<vector<pair<int,int>>>&PATH,vector<char>&ans)
{
    pair<int,int>prev=end,temp=end;
   while(temp!=start)
    {
       temp=PATH[prev.first][prev.second];
       
       ans.push_back(direct(prev,temp));
       prev=temp;
       
    }
    reverse(ans.begin(),ans.end());
}
int main()
{
ios_base::sync_with_stdio(false);
cin.tie(NULL);
int n,m;
cin>>n>>m;

vector<vector<char>>mat(n,vector<char>(m));
vector<vector<bool>>visited(n,vector<bool>(m));
pair<int,int>start,end,cord;

for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        cin>>mat[i][j];
        if(mat[i][j]=='#')
        visited[i][j]=true;
        else 
        {
        visited[i][j]=false;
        if(mat[i][j]=='A')
        start={i,j};
        else if(mat[i][j]=='B')
        end={i,j};        
        }        
    }
}
vector<vector<int>>dist(n,vector<int>(m,INT_MAX));
vector<char>route;
vector<vector<pair<int,int>>> PATH(n,vector<pair<int,int>>(m));
queue<pair<int,int>> Q;
Q.push(start);

visited[start.first][start.second]=true;
dist[start.first][start.second]=0;
while(!Q.empty())
{
    cord=Q.front();
    Q.pop();
    if(cord==end)
    break;

    for(auto path:paths)
    {  
        pair<int,int>temp={cord.first+path.first,cord.second+path.second};

        if(valid_node(temp,mat.size(),mat[0].size()) && !visited[temp.first][temp.second])
        {
            visited[temp.first][temp.second]=true;
            Q.push(temp);
            dist[temp.first][temp.second]=dist[cord.first][cord.second]+1;
            
            PATH[temp.first][temp.second]=cord;
        }
    }
}


if(visited[end.first][end.second])
{
    cout<<"YES\n";
    cout<<dist[end.first][end.second]<<endl;
    genpath(end,start,PATH,route);
    for(auto r:route)
    cout<<r;
    cout<<endl;
}
else
{
    cout<<"NO\n";
}


return 0;
}