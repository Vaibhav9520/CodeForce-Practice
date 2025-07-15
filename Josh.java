import java.util.*;
public class Josh {
    public static String solve(int[] arr){
        int n = arr.length;
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str,(a,b)->(a+b).compareTo(b+a));

        StringBuilder sb = new StringBuilder();
        for(String s: str){
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(solve(arr));
    }
}
