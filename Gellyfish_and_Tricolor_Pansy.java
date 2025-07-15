import java.util.*;

public class Gellyfish_and_Tricolor_Pansy {
    public static String winner(int a,int b, int ak, int bk){
        int result1 = Math.min(a,ak);
        int result2 = Math.min(b,bk);
        
        if(result1>=result2){
            return "Gellyfish";
        }
        else{
            return "Flower";
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ak = sc.nextInt();
            int bk = sc.nextInt();

            String result = winner(a,b,ak,bk);
            System.out.println(result);
            
        }
    }
}
