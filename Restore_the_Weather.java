import java.util.*;

public class Restore_the_Weather {
    static class Pair {
        int value;
        int index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Pair[] aWithIndex = new Pair[n];
            for (int i = 0; i < n; i++) {
                aWithIndex[i] = new Pair(a[i], i);
            }

            Arrays.sort(aWithIndex, Comparator.comparingInt(p -> p.value));
            Arrays.sort(b);

            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[aWithIndex[i].index] = b[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();  
        }
    }
}
