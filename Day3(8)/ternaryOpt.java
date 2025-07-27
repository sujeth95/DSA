import java.util.*;

public class ternaryOpt {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = src.nextInt();

        //--- Ternary Operator -----
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
