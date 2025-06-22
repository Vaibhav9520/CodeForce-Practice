import java.util.*;

public class Business_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

  
        Integer[] arr = new Integer[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr, Collections.reverseOrder());


        int sum = 0;
        int months = 0;
        for (int i = 0; i < 12; i++) {
            if (sum >= k) break;
            sum += arr[i];
            months++;
        }

        if (k == 0) {
            System.out.println(0);
        } else if (sum >= k) {
            System.out.println(months);
        } else {
            System.out.println(-1);
        }
    }
}
