import java.util.*;

public class DiamondPattern {
    public static void diamond(int n){
        //1st Half
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd Half of Pattern.
        for(int i=n; i>=1; i--){
             //Spaces
             for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
             }

             //Stars
             for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
             }

             System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = src.nextInt();

        diamond(n);
    }
}
