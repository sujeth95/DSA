import java.util.*;

public class FloydsTriangle {
    public static void floyds_triangle(int n){
        //Outer Loop 
        int counter = 1;
        for(int i=1; i<=n; i++){
            //Inner Loop -> How many times will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = src.nextInt();
        floyds_triangle(n);
    }
}
