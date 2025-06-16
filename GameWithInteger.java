import java.util.Scanner;

public class GameWithInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(); 

        while (t-- > 0) {
            long x = sc.nextLong(); 

            if (x % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }

        sc.close();
    }
}
