import java.util.Scanner;

public class LCS {
    static String str1;
    static String str2;
    static String[][] dp;

    public static String lcs(int n, int m) {
        if (n == 0 || m == 0) return "";

        if (dp[n][m] != null) return dp[n][m];

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            dp[n][m] = lcs(n - 1, m - 1) + str1.charAt(n - 1);
        } else {
            String a = lcs(n - 1, m);
            String b = lcs(n, m - 1);
            dp[n][m] = (a.length() > b.length()) ? a : b;
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        str2 = sc.nextLine();

        int m = str1.length();
        int n = str2.length();

        dp = new String[m + 1][n + 1];

        System.out.println(lcs(m, n));
    }
}


        // String result = buildLCS(m-1,n-1);
        // System.out.println(result);

        // StringBuilder sb = new StringBuilder();

        // for(int i=0;i<str1.length();i++){
        //     char ch1 = str1.charAt(i);
        //     for(int j=0;j<str2.length();j++){
        //         char ch2 = str2.charAt(j);
        //         if(ch1 == ch2){
        //             sb.append(ch2);
        //             break; 
        //         }
        //     }
        // }
        // System.out.println(sb.toString());