// package New;
import java.util.*;

public class Para {
    public static int calculateSum(int num1, int num2) {  //Parameters or formal parameters.
        
        int sum = num1 + num2;
        // System.out.println("Sum is : " + sum);
        return sum;
        //NOTE: If the sout is out the function you don't have to define the return type as (void)
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = src.nextInt();
        System.out.print("Enter the value of B: ");
        int b = src.nextInt();

        int sum = calculateSum(a,b);  //Arguments or acutal parameters.
        System.out.println("Sum is : " + sum);
    }
}
