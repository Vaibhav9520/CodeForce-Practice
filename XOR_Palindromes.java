import java.util.Scanner;

public class XOR_Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            int count = 0;
            for(int i=0;i<n/2;i++){
                if(str.charAt(i) != str.charAt(n-1-i)){
                    count++;
                }
            }
            StringBuilder sb = new StringBuilder();
            
            
        }
    }
}
