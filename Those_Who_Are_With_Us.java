import java.util.*;

public class Those_Who_Are_With_Us {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // Find max element
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }

            // Count frequency
            Map<Integer, Integer> freq_row = new HashMap<>();
            Map<Integer, Integer> freq_col = new HashMap<>();
            int total_freq = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == max) {
                        total_freq++;
                        freq_row.put(i, freq_row.getOrDefault(i, 0) + 1);
                        freq_col.put(j, freq_col.getOrDefault(j, 0) + 1);
                    }
                }
            }

            boolean result = false;
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    int contribution = 0;
                    if(arr[r][c] == max){
                        contribution = 1;
                    }
                    if (freq_row.getOrDefault(r, 0) + freq_col.getOrDefault(c, 0) - contribution == total_freq) {
                        result = true;
                    }
                }
            }

            if (result) {
                System.out.println(max - 1);
            } else {
                System.out.println(max);
            }
        }
    }
}
