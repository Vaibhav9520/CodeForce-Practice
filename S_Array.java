import java.util.Scanner;

public class S_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            boolean isBeautiful = false;

            for(int i=0;i<n-1;i++) {
                if(Math.abs(a[i]-a[i+1])<=1){
                    isBeautiful = true;
                    break;
                }
            }

            if(isBeautiful){
                System.out.println(0);
                continue;
            }
            if(n==2){
                System.out.println(-1);
                continue;
            }

            boolean possible = false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(Math.abs(a[i] - a[j])<=(j-i)){
                        possible = true;
                        break;
                    }
                }
                if(possible) break;
            }

            if(possible){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
    }
}
