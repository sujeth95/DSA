import java.util.*;

public class Swap {
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

    public static void swap(int a, int b){
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        // Swap --> value exchange
        int a = 5;
        int b = 10;
        swap(a, b);

        // System.out.println("a = " + a); // THEY BOTH RETURNS THE ORIGINAL VALUE AND NOT THE SWAPPED VALUE.
        // System.out.println("b = " + b);
    }
}