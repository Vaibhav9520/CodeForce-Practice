import java.util.Scanner;

public class Shashliks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();


            if(k < a && k < b) {
                System.out.println(0);
                continue;
            }
            int ansk_y = (k - b + 1 + y) / y;
            int ansk_a = (k - a + 1 + x) / x;

            int ansa_b = (a - b + 1 + y) / y;

            int ans1 = ansk_a+ansa_b;

            int ans = Math.max(ans1,ansk_y);

            System.out.println(ans);
        }
    }
}
