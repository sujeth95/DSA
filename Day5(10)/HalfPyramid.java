import java.util.*;

public class HalfPyramid {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = src.nextInt();

        for(int line=1; line<=num; line++){
            //numbers print.
            for(int number=1; number<=line; number++){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
