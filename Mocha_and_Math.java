import java.util.*;
public class Mocha_and_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr =  new int[n];

            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            
            int result = arr[0];
            for (int i = 1; i < n; i++) {
                result &= arr[i];  
            }
            System.out.println(result);
        }
    }
}
