import java.util.*;

public class InvRotatedPat {
    public static void inverted_rotated_half_pyramid(int n){
        //Outer Loop
        for(int i=1; i<=n; i++){
            //Printing Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Printing Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Your value: ");
        int n = src.nextInt();
        inverted_rotated_half_pyramid(n);
    }
}
