import java.util.*;

public class Calculator {
    public static void main(String arg[]){
        Scanner src = new Scanner (System.in);
        System.out.print("Enter value of a: ");
        int a = src.nextInt();
        System.out.print("Enter value of b: ");
        int b = src.nextInt();
        System.out.print("Enter operator: ");
        char operator = src.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("Your output is: " + (a+b));
                        break;
            case '-' : System.out.println("Your output is: " + (a-b));
                        break;
            case '*' : System.out.println("Your output is: " + (a*b));
                        break;
            case '/' : System.out.println("Your output is: " + (a/b));
                        break;
            case '%' : System.out.println("Your output is: " + (a%b));
                        break;
            default: System.out.println("Ja Ke Calculator Khrid.");
        }
    }
}
