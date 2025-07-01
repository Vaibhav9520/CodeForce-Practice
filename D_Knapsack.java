import java.util.*;

public class D_Knapsack {
    static long[][] dp;

    public static long knapsack(long[] value, long[] weight, int n, int w) {
        if (n == 0 || w == 0) return 0;
        if (dp[n][w] != -1) return dp[n][w];

        if (weight[n - 1] > w) {
            dp[n][w] = knapsack(value, weight, n - 1, w);
        } else {
            long pick = value[n - 1] + knapsack(value, weight, n - 1, w - (int)weight[n - 1]);
            long notPick = knapsack(value, weight, n - 1, w);
            dp[n][w] = Math.max(pick, notPick);
        }

        return dp[n][w];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();

        long[] weight = new long[n];
        long[] value = new long[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextLong();
            value[i] = sc.nextLong();
        }

        dp = new long[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(knapsack(value, weight, n, w));
    }
}
