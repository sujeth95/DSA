import java.util.*;

public class Operators {
    public static void main(String args[]){
        
        // ==== Binary Operator(Arithmetic Operator) =====
        // int A = 10;
        // int B = 5;
        // System.out.println("Sum: "+ (A+B)+".");
        // System.out.println("Difference: "+ (A-B)+".");
        // System.out.println("Multiply: "+ (A*B)+".");
        // System.out.println("Divide: "+ (A/B)+".");
        // System.out.println("Reminder: "+ (A%B)+".");

        // ===== Unary Operator (Arithmetic Operator) =====
        // int a = 10;
        // int b = a--;
        // System.out.println(a);
        // System.out.println(b);
        
        // ==== Relational Operator =====
            // int A = 10;
            // int B = 10;
            // System.out.println(A == B);
            // System.out.println(A != B);
            // System.out.println(A > B);
            // System.out.println(A < B);
            // System.out.println(A >= B);
            // System.out.println(A <= B);

            // ====== Logical Operators =====
            // ---- && (Logical AND) -----
            // System.out.println((3 > 2) && (5 > 0));
            // System.out.println((3 < 2) && (5 > 0));
            // System.out.println((3 > 2) && (5 < 0));
            // System.out.println((3 < 2) && (5 < 0));

            // ----- || (Logical OR) ------
            // System.out.println((3 > 2) || (5 < 0));
            // System.out.println((3 < 2) || (5 < 0));

            // ------ ! (Logical NOT) -----
            // System.out.println(!(0<5));

            // ====== Assignment Operator ======
                int A = 10;
                // A = A + 10;
                A += 10;
                int B = 5;
                // B -= 5;
                B *= 5;
                System.out.println(A);
                System.out.println(B);
    }
}