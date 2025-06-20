import java.util.*;

public class Poisoned_Dagger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            long h = sc.nextLong(); 

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long low = 1, high = h, answer = h;

            while (low <= high) {
                long mid = low + (high - low) / 2;

                if (isEnough(mid, a, h)) {
                    answer = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(answer);
        }
    }

 
    static boolean isEnough(long k, int[] a, long h) {
        long totalDamage = 0;

        for (int i = 0; i < a.length - 1; i++) {
            totalDamage += Math.min(k, a[i + 1] - a[i]);
        }

        totalDamage += k; 
        return totalDamage >= h;
    }
}
