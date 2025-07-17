import java.util.Scanner;

public class NewsDistribution {
    static int[] parent, size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();  

        parent = new int[n + 1];
        size = new int[n + 1];

        for(int i=1;i<=n;i++){
            parent[i] = i;
            size[i] = 1;
        }











        for(int i=0;i<m;i++){
            int k = sc.nextInt(); 
            if(k==0) continue;

            int first = sc.nextInt();
            for(int j=1;j<k;j++){
                int next = sc.nextInt();
            }
        }
    }
}
