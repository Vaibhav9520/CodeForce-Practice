import java.util.*;

public class ForeverWinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i <= n; i++)
                adj.add(new ArrayList<>());

            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
                
            }

            int corner= 0;
            for(int i = 1; i <= n; i++){
                if(adj.get(i).size() == 1) {
                    corner = i;
                    break;
                }
            }
            
            int inside = adj.get(corner).get(0);
            int center = 0;

            for (int node : adj.get(inside)) {
                if (adj.get(node).size() > 1 && node != corner) {
                    center = node;
                    break;
                }
            }


            int x = adj.get(center).size();
            int y = adj.get(inside).size()-1;

            System.out.print(x+" " + y + "\n");
            
            


        }
    }
}
