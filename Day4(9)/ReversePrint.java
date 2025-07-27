import java.util.*;

public class ReversePrint {
    public static void main(String arg[]){
        int n = 10899;
        int lastDigit;
        
        while(n > 0){
            lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;  //n/=10
        }
    }
}
