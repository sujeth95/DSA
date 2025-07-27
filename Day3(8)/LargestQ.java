import java.util.*;

public class LargestQ {
    public static void main(String arg[]){
        Scanner src = new Scanner (System.in);

        System.out.print("Enter A: ");
        int A = src.nextInt();
        System.out.print("Enter B: ");
        int B = src.nextInt();

        if(A > B){
            System.out.println("A is largest.");
        }
        if(B > A){
            System.out.println("B is largest.");
        }
        else{
            System.out.println("Both numbers are equal.");
        }
    }
}
