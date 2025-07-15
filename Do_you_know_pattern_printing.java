import java.util.Scanner;

public class Do_you_know_pattern_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String[][] arr = new String[n][m];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = sc.next();
                }
            }

            // String[][] arr = new String[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j].equals("#")){
                        
                    }
                }
            }
        }

    }
}
