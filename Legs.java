import java.util.*;
public class Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            
            int n = sc.nextInt();
            int count = n/4;
            int rem = n%4;
            int ans = rem/2;
            int result = count + ans;
            
            System.out.println(result);
        }  
     }
     
}
