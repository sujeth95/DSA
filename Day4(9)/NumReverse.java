import java.util.*;

public class NumReverse {
    public static void main(String arg[]){
        int rev = 0;
        int n = 10899;
        
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
