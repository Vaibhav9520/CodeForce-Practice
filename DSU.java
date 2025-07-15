import java.util.Arrays;

public class DSU {
    int[] parent;
    int[] rank;
    
    DSU(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        Arrays.fill(rank, 0);
    }

    int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }

    void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        
        if (pa == pb) return;
        
        if (rank[pa] > rank[pb]) {
            parent[pb] = pa;
        } else if (rank[pa] < rank[pb]) {
            parent[pa] = pb;
        } else {
            parent[pb] = pa;
            rank[pa]++;
        }
    }
    
    public static void main(String[] args) {
        DSU dsu = new DSU(5);
        dsu.union(0, 1);
        dsu.union(2, 3);
        dsu.union(0, 4);
        
        System.out.println(dsu.find(1) == dsu.find(4));
        System.out.println(dsu.find(2) == dsu.find(3)); 
        System.out.println(dsu.find(0) == dsu.find(3)); 
    }
}