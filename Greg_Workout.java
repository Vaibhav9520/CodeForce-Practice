import java.util.*;

public class Greg_Workout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        String a = "chest";
        String b = "biceps";
        String c = "back";

        int max = arr[0];

        
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int temp = max % 3;

        if(temp == 0){
            System.out.println(a);   
        }
        else if(temp == 1){
            System.out.println(c);   
        } else {
            System.out.println(b);   
        }
    }
}
