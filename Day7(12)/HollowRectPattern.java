// package Day7(12);
import java.util.*;

public class HollowRectPattern {
    public static void hollow_rectangle(int totRows, int totCols){
        //Outer Loop
        for(int i=1; i<=totRows; i++){
            //Inner Loop -> columns
            for(int j=1; j<=totCols; j++){
                //Cell No. -> (i,j)
                if(i==1 || i==totRows || j==1 || j==totCols) {
                    //boundary cells
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int a = src.nextInt();
        System.out.print("Enter Column: ");
        int b = src.nextInt();

        hollow_rectangle(a, b);
    }
}