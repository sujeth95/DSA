import java.util.*;

public class ThreeLargest {
    public static void main(String arg[]){
        Scanner src = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = src.nextInt();
        System.out.print("Enter b: ");
        int b = src.nextInt();
        System.out.print("Enter c: ");
        int c = src.nextInt();

        // if (a > b){
        //     System.out.println("A is largest.");
        // }
        // else if(b > c){
        //     System.out.println("B is largest.");
        // }
        // else{
        //     System.out.println("C is largest.");
        // }

        // -------- OR (In more Logical Way) --------
        if((a >= b) && (a >= c)){
            System.out.println("A is largest.");
        }
        else if (b >= c){
            System.out.println("B is largest.");
        }
        else{
            System.out.println("C is largest.");
        }
    }
}
