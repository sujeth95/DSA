import java.util.*;

public class Question3 {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter You Day Number: ");
        int week = src.nextInt();

        switch(week){
            case 1 : System.out.println("Today is Monday.");
                        break;
            case 2 : System.out.println("Today is Tuesday.");
                        break;
            case 3 : System.out.println("Today is Wednesday.");
                        break;
            case 4 : System.out.println("Today is Thrusday.");
                        break;
            case 5 : System.out.println("Today is Friday.");
                        break;
            case 6 : System.out.println("Today is Saturday.");
                        break;
            case 7 : System.out.println("Today is Sunday.");
                        break;
            default : System.out.println("Everyday is Holiday.");
                        break;
        }
    }
}
