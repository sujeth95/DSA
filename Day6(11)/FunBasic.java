import java.util.*;

public class FunBasic {
    public static void printHelloWorld(){
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
        return;
    }

    public static int calculateSum(int num1, int num2){   // Parameters or formal parameters.
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = src.nextInt();
        System.out.print("Enter value of b: ");
        int b = src.nextInt();

        int sum1 = calculateSum(a,b); // arguments or actual parameters.
        printHelloWorld();   // Calling functions.
    }
}
