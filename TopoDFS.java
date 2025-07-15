import java.util.*;

public class TopoDFS {

    public static void dfs(List<List<Integer>> adj, boolean[] vis, Set<Integer> dup, Stack<Integer> st, int node) {
        vis[node] = true;
        for (int neib : adj.get(node)) {
            if (!vis[neib]) {
                dfs(adj, vis, dup, st, neib);
            }
        }
        if (!dup.contains(node)) {
            st.push(node);
            dup.add(node);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {
            int c = sc.nextInt();
            for (int j = 0; j < c; j++) {
                int p = sc.nextInt();
                adj.get(p).add(i); 
            }
        }

        boolean[] vis = new boolean[n + 1];
        Set<Integer> dup = new HashSet<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                dfs(adj, vis, dup, st, i);
            }
        }

        while (!st.isEmpty()) {
            int top = st.pop();
            if (top == 1) break;
            System.out.print(top + " ");
            
        }

        sc.close();
    }
}
