import java.util.*;

public class Pattern {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        // System.out.print("Enter Your number: ");
        // int num = src.nextInt();

        // for(int line=1;line<=num;line++){
        //     for(int star=1;star<=line;star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        System.out.print("Enter Your pattern size: ");
        int num = src.nextInt();
        for(int line=1;line<=num;line++){
            for(int space=1;space<=line;space++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
