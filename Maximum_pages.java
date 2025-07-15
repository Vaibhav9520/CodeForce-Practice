import java.util.*;

public class Maximum_pages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 

        int[] books = new int[n];
        int[] pages = new int[n];

        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt(); 
        }
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt(); 
        }

        int[] dp = new int[k + 1];

        for (int i = 0; i < n; i++) {
            for (int j = k; j >= books[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - books[i]] + pages[i]);
            }
        }

        System.out.println(dp[k]);
    }
}
