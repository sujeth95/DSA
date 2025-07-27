import java.util.*;

public class continueStmt {
    public static void main(String arg[]){
    //     for(int i=1; i<=5;i++){
    //         if(i == 3){
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    // }
    // -------------------------------------------------------------------
    //(Q) Display all numbers entered by user except multiples of 10.
    Scanner src = new Scanner(System.in);

    do{
        System.out.print("Enter the required number: ");
        int n = src.nextInt();

        if(n % 10 == 0){
            continue;
        }

        System.out.println("Number was: " + n);
        
    }while(true);
}
}
