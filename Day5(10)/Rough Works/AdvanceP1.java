import java.util.*;

public class AdvanceP1 {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your Row: ");
        int rows = src.nextInt();    // Number of rows
        System.out.print("Enter your Column: ");
        int cols = src.nextInt();    // Number of columns

        for (int i = 1; i <= rows; i++) { // Rows
            for (int j = 1; j <= cols; j++) { // Columns
                // Print star at borders, space inside
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }    
        
    }
}
