import java.util.*;
public class colering_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            long ans=0;
            int mx=a[n-1];
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    int sum=a[i]+a[j],l=j+1,r=n-1,pos=n;
                    while(l<=r){
                        int m=(l+r)/2;
                        if(sum+a[m]>mx){
                            pos=m;
                            r=m-1;
                        }else l=m+1;
                    }
                    ans+=n-pos;
                }
            }
            System.out.println(ans);
        }
    }
}
