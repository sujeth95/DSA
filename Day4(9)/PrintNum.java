import java.util.*;

public class PrintNum {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        // int num = 0;
        // while (num < 10){
        //     num++;
        //     System.out.print(" " + num);

        // ====== OR =======
        // int counter = 1;
        // while(counter <= 10){
        //     System.out.print(counter + " ");
        //     counter ++;
        // }
        // }

        // ======= Print Number from 1 to n ======
        // int counter = 1;
        // System.out.print("Enter your range: ");
        // int range = src.nextInt();

        // while (counter <= range){
        //     System.out.print(counter + " ");
        //     counter++;
        // }

        // ======= Print sum of first n natural number ========
        int counter = 1;
        System.out.print("Enter your number: ");
        int num = src.nextInt();
        int sum = 0;

        while (counter <= num){
            System.out.print(counter + " ");
            sum += counter;
            counter ++;
        }
        System.out.println("\nThe sum is: " + sum);
        
    }
}
