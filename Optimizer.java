import java.util.*;
public class Optimizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(i<j){
                    if(arr[j]-arr[i] == j-i){
                        count++;
                    }
                }
                }
            }
            System.out.println(count);
        }
    }
}

// import java.util.*;

// public class Optimizer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             Map<Integer, Integer> freq = new HashMap<>();

//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//                 int key = arr[i] - i;
//                 freq.put(key, freq.getOrDefault(key, 0) + 1);
//             }

//             long count = 0;
//             for (int val : freq.values()) {
//                 count += (long) val * (val - 1) / 2;
//             }

//             System.out.println(count);
//         }
//     }
// }
