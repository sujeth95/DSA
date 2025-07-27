// package New;
import java.util.*;

public class RangePrime {
    //Prime within Range
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n==2){
            isPrime = true;
            return isPrime;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = src.nextInt();
        primeInRange(n);  //Prints Prime from 2 to n
    }
}
