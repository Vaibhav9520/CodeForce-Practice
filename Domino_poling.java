import java.util.Scanner;

public class Domino_poling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int total_size = n * m;
        int domino_Size = 2;

        int result = total_size / domino_Size;
        System.out.println(result);
    }
}
