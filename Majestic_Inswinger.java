import java.util.*;
public class Majestic_Inswinger{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        Deque<Integer> dq=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&&dq.peekFirst()<=i-k) dq.pollFirst();
            while(!dq.isEmpty()&&arr[dq.peekLast()]<arr[i]) dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1) sb.append(arr[dq.peekFirst()]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
