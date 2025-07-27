import java.util.*;

public class keepTill {
    public static void main(String arg[]){
        Scanner src = new Scanner (System.in);
        // (Q) Keep entering numbers till user enters a multiple of 10.
        do{
            System.out.print("Enter your number: ");
            int n = src.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
