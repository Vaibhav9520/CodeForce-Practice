import java.util.*;

public class D_Knapsack {
    public static int knapsack(int[] value,int[] weight,int n,int w,int curr,int[] dp){
        if(n==0||w<=0) return 0;
        

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];
        for(int i=0;i<n;i++){
            value[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int result = 0;

        System.out.println(knapsack(value,weight,n,w,0,dp));
    }
}
