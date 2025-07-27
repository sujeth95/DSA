// package New;
import java.util.*;

public class ProdAandB {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int num1 = src.nextInt();
        System.out.print("Enter the value of B: ");
        int num2 = src.nextInt();

        int prod = multiply(num1,num2);
        System.out.println("Product of A and B is: " + prod);

        // Scanner.close();
    }
}
