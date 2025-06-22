import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while(t-- > 0) {
            int n = sc.nextInt(); 
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] dayCount = {a, b, c};
            int oneCycle = a + b + c;

            int cycleCount = n / oneCycle;
            int totalKm = cycleCount * oneCycle;
            int day = cycleCount * 3;

            int i = 0;
            while (totalKm < n) {
                totalKm += dayCount[i];
                day++;
                i = (i + 1) % 3;
            }

            System.out.println(day);
        }

        sc.close();
    }
}
