import java.util.*;

public class SchoolFunding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong(); 

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Map<Long, Long> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1L); 

        long sum = 0L;
        long totalFunding = 0L;

        for (int i = 0; i < n; i++) {
            sum += a[i];

            totalFunding += prefixCount.getOrDefault(sum - x, 0L);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0L) + 1L);
        }

        System.out.println(totalFunding); 
    }
}
