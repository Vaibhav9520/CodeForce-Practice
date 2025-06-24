import java.util.*;
public class Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int alice = sc.nextInt();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            String ans = "NO";

            if((p1<alice && p2<alice)|| (p1>alice && p2>alice)) ans = "YES";

            System.out.println(ans);
        }
    }
}
