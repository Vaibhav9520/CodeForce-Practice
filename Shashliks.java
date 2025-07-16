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

            int ansk_y = 1 + (k - b)/y;
            int ansk_a = 1 + (k - a)/x;
            int ansa_y = 1 + (a - b)/y;
        }
    }
}
