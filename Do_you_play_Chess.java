import java.util.*;

public class Do_you_play_Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); 

        while (t-- > 0) {
            String str = sc.nextLine().trim();
            char col = str.charAt(0); 
            char row = str.charAt(1); 

            for (char r='1';r<='8';r++) {
                if (r!= row) {
                    System.out.println(col+""+r);
                }
            }

            for (char c='a';c<='h';c++) {
                if (c != col) {
                    System.out.println(c+""+row);
                }
            }
        }
    }
}
