import java.util.*;

public class AboveTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();  
            String s = sc.next();  

            char first = s.charAt(0);
            char last = s.charAt(n - 1);
            String middle = s.substring(1, n - 1);

            String combined = "" + first + last;

            if (combined.contains(middle)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
