import java.util.*;
public class Way_To_Long_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();
            int count = str.length();

            if(count <= 10){
                System.out.println(str);
            }
            else{
                System.out.println(str.charAt(0) + "" + (count - 2) + str.charAt(count - 1));
            }
            
        }
    }
}
