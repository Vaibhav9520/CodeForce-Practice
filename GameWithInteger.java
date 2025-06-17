import java.util.Scanner;

public class GameWithInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(); 

        while (t-- > 0) {
            long n = sc.nextLong(); 

            if ((n+1)%3== 0 || (n-1)%3==0) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
