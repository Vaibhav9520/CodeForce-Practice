import java.util.*;

public class Contest_A {
    public static boolean isInside(int x, int a, int b) {
        if (a < b) return x > a && x < b;
        else return x > a || x < b;
    }

    public static boolean doIntersect(int a, int b, int c, int d) {
        return isInside(c, a, b) != isInside(d, a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (doIntersect(a, b, c, d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}







