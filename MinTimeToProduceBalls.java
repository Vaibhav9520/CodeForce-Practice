import java.util.*;

public class MinTimeToProduceBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] machines = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            machines[i] = sc.nextLong();
            if (machines[i] > max) max = machines[i];
        }

        long low = 1, high = max * t, ans = high;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (canProduce(machines, mid, t)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }

    static boolean canProduce(long[] machines, long time, long target) {
        long total = 0;
        for (long m : machines) {
            total += time / m;
            if (total >= target) return true; 
        }
        return false;
    }
}
