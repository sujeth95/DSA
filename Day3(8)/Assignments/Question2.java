import java.util.*;

public class Question2 {
    public static void main(String arg[]){
        double temp = 103.5;
        if ((temp >= 100) && (temp < 500)){
            System.out.println("You have a fever.");
        }
        else if(temp > 500) {
            System.out.println("You are dead.");
        }
        else {
            System.out.println("You don't have a fever.");
        }
    }
}
