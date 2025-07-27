import java.util.*;

public class Elseif {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = src.nextInt();

        if (age >= 18){
            System.out.println("Adult.");
        }
        else if(age >= 13 && age < 18){
           System.out.println("Teenager.");
        }
        else{
            System.out.println("Child.");
        }
    }
}
