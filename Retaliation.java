import java.util.*;
public class Retaliation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                int num = arr[i];  // 21,18,15,12,9---
                if((num - i) == 0 || (num - (n-i+1)) == 0){
                    System.out.println("YES");
                    break;
                }
            }
        }
    }
}
