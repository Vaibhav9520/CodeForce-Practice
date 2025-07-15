#include<bits/stdc++.h>
#define int long long
using namespace std;
//problem e
#define fastt ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0)
void dfs(vector<vector<int>>&adj,vector<int>&vis,set<int>&already,vector<int>&ans,int node)
{
    vis[node]=1;
    for(auto &it:adj[node])
    {
        if(!vis[it])
        {
            dfs(adj,vis,already,ans,it);
            /*if(already.find(it)==already.end())
            {
               ans.push_back(it);
               already.insert(it);
            }*/
        }
    }
    if(node>1&&already.find(node)==already.end())
    {
        ans.push_back(node);
        already.insert(node);
    }
}
int32_t main()
{
    fastt;
    int n;
    cin>>n;
    vector<vector<int>>adj(n+1);
    for(int i=1;i<=n;i++)
    {
        int c;
        cin>>c;
        for(int j=0;j<c;j++)
        {
            int inp;
            cin>>inp;
            adj[i].push_back(inp);
        }
    }
    set<int>already;
    vector<int>ans,vis(n+1);
    dfs(adj,vis,already,ans,1);
    for(auto &it:ans) cout<<it<<" ";
    return 0;
}




// #include <bits/stdc++.h>
// using namespace std;

// void dfs(const vector<vector<int>> &adj, vector<int> &vis, set<int> &dup, stack<int> &st, int node) {
//     vis[node]++;
//     for (auto &neib : adj[node]) {
//         if (!vis[neib]) dfs(adj, vis, dup, st, neib);
//     }
//     if (dup.find(node) == dup.end()) {
//         st.push(node);
//         dup.insert(node);
//     }
// }

// int main() {
//     int n;
//     cin >> n;
//     vector<vector<int>> adj(n + 1);

 
//     for (int i = 1; i <= n; i++) {
//         int c;
//         cin >> c;
//         for (int j = 0; j < c; j++) {
//             int p;
//             cin >> p;
//             adj[p].push_back(i);
//         }
//     }

//     vector<int> vis(n + 1);
//     set<int> dup;
//     stack<int> st;

//     for (int i = 1; i <= n; i++) {
//         if (!vis[i]) {
//             dfs(adj, vis, dup, st, i);
//         }
//     }

//     while (!st.empty()) {
//         int top = st.top(); st.pop();
//         cout << top << " ";
//         if (top == 1) break;
//     }

//     return 0;
// }