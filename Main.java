import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0) break;
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            Stack<Integer> side=new Stack<>();
            int need=1, i=0;
            while(i<n){
                if(arr[i]==need){
                    need++;
                    i++;
                }else if(!side.isEmpty() && side.peek()==need){
                    side.pop();
                    need++;
                }else{
                    side.push(arr[i]);
                    i++;
                }
            }
            while(!side.isEmpty() && side.peek()==need){
                side.pop();
                need++;
            }
            System.out.println(need==n+1 ? "yes" : "no");
        }
    }
}
