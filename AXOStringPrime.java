import java.util.*;
public class AXOStringPrime {
       public static boolean isPrime(int n) {
        if (n <= 1) return false;         
        if (n == 2) return true;          
        if (n % 2 == 0) return false;     

        for(int i=3;i*i<=n;i +=2){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static String encrypt(int[] digit){
        
        char[] vowel = {'a','e','i','o','u'};
        char[] cons = "bcdfghjklmnpqrstvwxyz".toCharArray();
        String result = "";
        Map<Integer, Character> map = new HashMap<>();
        
        int vcount=0;
        int ccount=0;
        
        for(int i=0;i<digit.length;i++){
            int d = digit[i];
            if(map.containsKey(d)){
                result += map.get(d);
                continue;
            }
            
            if(isPrime(d)){
                if(vcount>=5) vcount=0;
                map.put(d,vowel[vcount]);
                vcount++;
            }else{
                map.put(d,cons[ccount]);
                ccount++;
            }
            
            result += map.get(d);
            
        }
        // Arrays.sort(result.toString);
        return result;
    }
    public static void main(String[] args) {
        int[] digit = {2,3,5,7,11,17,29,37,8,6};
        System.out.println(encrypt(digit));
    }
}
