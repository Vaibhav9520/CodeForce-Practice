import java.util.*;

public class Are_Password_good {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] angles = new int[n];
        for (int i = 0; i < n; i++) {
            angles[i] = sc.nextInt();
        }

        boolean found = false;

        int totalComb = 1 << n; 
        for (int mask = 0; mask < totalComb; mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += angles[i]; 
                } else {
                    sum -= angles[i];
                }
            }

            if ((sum % 360 + 360) % 360 == 0) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}
