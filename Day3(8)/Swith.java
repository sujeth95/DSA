import java.util.*;

public class Swith {
    public static void main(String arg[]){
        Scanner src = new Scanner (System.in);
        System.out.print("Enter the character: ");
        String number = src.nextLine();

        switch (number) {
            case "a" : System.out.println("Samosa.");
                        break;
            case "b" : System.out.println("Burger.");
                        break;
            case "c" : System.out.println("Mango Shake.");
                        break;
            default : System.out.println("Wake up from dream.");
                        break;
        }
    }
}
