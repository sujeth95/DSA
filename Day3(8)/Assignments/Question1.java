import java.util.*;

public class Question1 {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = src.nextInt();
        
        if (num >= 0){
            System.out.println("Positive number.");
        }
        else if (num < 0){
            System.out.println("Negative number.");
        }
        else{
            System.out.println("Not a number.");
        }
    }
}
