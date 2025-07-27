import java.util.*;

public class OddEvenQ {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = src.nextInt();
        if(num % 2 == 0){
            System.out.println("Even Number.");
        }
        else{
            System.out.println("Odd Number.");
        }
    }
}
