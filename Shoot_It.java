import java.util.*;

public class Shoot_It {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        while (t-- > 0) {
            String[][] arr = new String[10][10];

            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine(); 
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = String.valueOf(line.charAt(j));
                }
            }

            int result = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i][j].equals("X")) {
                        //1
                        if ((i == 0 || i == 9 || j == 0 || j == 9)) {
                            result += 1;
                        }
                        //2
                        else if ((i == 1 || i == 8 || j == 1 || j == 8)) {
                            result += 2;
                        }
                        //3
                        else if ((i == 2 || i == 7 || j == 2 || j == 7)) {
                            result += 3;
                        }
                        //4
                        else if ((i == 3 || i == 6 || j == 3 || j == 6)) {
                            result += 4;
                        }
                        //5 
                        else if ((i == 4 || i == 5 || j == 4 || j == 5)) {
                            result += 5;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
