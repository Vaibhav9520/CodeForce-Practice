import java.util.*;
public class Letter_Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int min = arr[0];
            int max = arr[n-1];
            int back = 0;
            int front = 0;

            if(min < s) back = s-min;
            if(max > s) front = max-s;

            int result = 2*(Math.min(back, front)) + Math.max(back, front);
            System.out.println(result);
        }
    }
}
