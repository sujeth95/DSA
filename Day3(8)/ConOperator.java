import java.util.*;

public class ConOperator {
    public static void main (String arg[]){
        Scanner src = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = src.nextInt();
        if(age >= 18){
            System.out.println("Vote, Drive");
        }
        if(age > 13 && age < 18){
            System.out.println("You're a teenage.");
        }
        else{
            System.out.println("You're still a minor.");
        }
    }
}
