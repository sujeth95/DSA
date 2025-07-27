import java.util.*;

public class Prime2Opt {
    // Prime or Not more optimized approach.
    
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = src.nextInt();
        System.out.println(isPrime(n));
    }
}