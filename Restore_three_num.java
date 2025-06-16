import java.util.*;

public class Restore_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        //d = arr[0];
        int a = arr[3] - arr[2];
        int b = arr[3] - arr[1];
        int c = arr[3] - arr[0];
        System.out.println(a + " " + b + " " + c);



    }
}
