import java.util.Scanner;

public class C_Vacation {

    static int[][] dp;

    public static int score(int[][] arr, int last, int n) {
        if (n == 0) return 0;

        if (dp[n][last] != -1) return dp[n][last];

        int a = 0, b = 0, c = 0;

        if (last == 0) {
            b = score(arr, 1, n - 1) + arr[n - 1][1];
            c = score(arr, 2, n - 1) + arr[n - 1][2];
        }
        if (last == 1) {
            a = score(arr, 0, n - 1) + arr[n - 1][0];
            c = score(arr, 2, n - 1) + arr[n - 1][2];
        }
        if (last == 2) {
            a = score(arr, 0, n - 1) + arr[n - 1][0];
            b = score(arr, 1, n - 1) + arr[n - 1][1];
        }

        return dp[n][last] = Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        dp = new int[n + 1][3];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = -1;
            }
        }

        int result = Math.max(score(arr, 0, n),
                        Math.max(score(arr, 1, n),
                                 score(arr, 2, n)));

        System.out.println(result);
    }
}
