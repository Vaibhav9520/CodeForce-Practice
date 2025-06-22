import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] giver = new int[n];

        for(int i=0;i<n;i++){
            giver[i] = sc.nextInt();
        }

        int[] reciver = new int[n];
        for(int i=0;i<n;i++){
            reciver[giver[i]-1] = i+1;
        }

        for(int i=0;i<n;i++){
            System.out.print(reciver[i]+" ");
        }
    }
}
