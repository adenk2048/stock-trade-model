#include <bits/stdc++.h>
using namespace std;

int n,m,e,v;

struct Edge
{
    int to;
    double l,r;
};

vector<Edge>vec[100005];
vector<pair<int, double>> events;
vector<double> values;
queue<int>que;
int pos;

bool vis[100005];

void bfs(int x)
{
    que = {};
    for(int i=1;i<=n;i++)vis[i]=false;
    que.push(x);
    vis[x]=true;
    
    while(!que.empty())
    {
        pos = que.front();
        que.pop();

        for(Edge i:vec[pos])
        {
            if(!vis[i.to])
            {
                vis[i.to]=true;
                que.push(i.to);
            }
            //update values
        }
    }
}


int main(){
    cin >> n >>m;
    ifstream cin("adj.txt");

    for(int x,y,i=1;i<=m;i++)
    {
        int a,b;
        double l,r;

        cin >> a >> b;
        cin >> l >> r;
        vec[x].push_back({y,l,r});
        cin >> l >> r;
        vec[y].push_back({x,l,r});
    }
    for (int i = 0; i < n; i ++){
        cin >> v;
        values.push_back(v);
    }

    cin >> e;

    for (int i = 0; i < e; i ++){

    }

    return 0;
}