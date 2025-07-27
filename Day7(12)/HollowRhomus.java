import java.util.*;

public class HollowRhomus {
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Hollow Rectangle -> stars
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = src.nextInt();
        hollow_rhombus(n);
    }
}
