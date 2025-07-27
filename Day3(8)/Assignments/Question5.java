import java.util.*;

public class Question5 {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Your Year: ");
        int year = src.nextInt();

        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year.");
                }
                else{
                    System.out.println("Not a Leap Year.");
                }
            }
            else{
                System.out.println("Leap Year.");
            }
        }
        else{
            System.out.println("Not a leap year.");
        }
    }
}
