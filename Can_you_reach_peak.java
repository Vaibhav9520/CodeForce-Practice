import java.util.*;
public class Can_you_reach_peak {
    public static int solve(int n,int[] arr){
        int xor = 0;
        for(int i=0;i<n;i++) xor ^= arr[i];
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println(solve(n,arr));
    }
}
