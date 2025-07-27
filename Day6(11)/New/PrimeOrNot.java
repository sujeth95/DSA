import java.util.*;

public class PrimeOrNot{
    public static boolean isPrime(int n) {
        //Corner Cases
        
        //Only for n>=2
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n==2) {
                return true;
            }

            if(n%i==0){
                isPrime = false;
                System.out.println("This is not a Prime Number");
                return isPrime;
                // break;
            } 
        }
        System.out.println("This is a Prime number.");
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = src.nextInt();
        isPrime(n);
        // System.out.println(isPrime(7));

        // Scanner.close();
    }
}