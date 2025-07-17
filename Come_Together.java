import java.util.*;

public class Come_Together {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-- > 0){
            int xA = sc.nextInt();
            int yA = sc.nextInt();
            int xB = sc.nextInt();
            int yB = sc.nextInt();
            int xC = sc.nextInt();
            int yC = sc.nextInt();

            int[] x = {xA, xB, xC};
            int[] y = {yA, yB, yC};

            Arrays.sort(x);
            Arrays.sort(y);

            int xMedian = x[1];
            int yMedian = y[1];

            int distance = Math.abs(xA - xMedian) + Math.abs(yA - yMedian) +
                           Math.abs(xB - xMedian) + Math.abs(yB - yMedian) +
                           Math.abs(xC - xMedian) + Math.abs(yC - yMedian);

            System.out.println(distance);
        }
        sc.close();
    }
}
