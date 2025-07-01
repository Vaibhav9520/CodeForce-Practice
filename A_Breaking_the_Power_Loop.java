import java.util.Scanner;

class A_Breaking_the_Power_Loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int result = 0;

            while(n>0){
                result += n%k;
                n = n/k;
            }

            System.out.println(result);
        }
    }
}